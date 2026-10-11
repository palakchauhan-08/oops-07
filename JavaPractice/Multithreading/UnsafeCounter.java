public class UnsafeCounter {
    // Static nested class avoids class-name conflicts across programs in the default package
    static class Counter {
        int count = 0;

        void increment() {
            count++;
        }
    }

    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final count: " + c.count);
    }
}