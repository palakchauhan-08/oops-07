class SleepingTask extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread is sleeping...");
            Thread.sleep(2000);
            System.out.println("Thread resumed after 2 seconds");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        SleepingTask t = new SleepingTask();
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }

        try {
            t.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }
    }
}