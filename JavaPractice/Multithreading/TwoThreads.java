class PrintTask extends Thread {
    PrintTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        PrintTask t1 = new PrintTask("Thread A");
        PrintTask t2 = new PrintTask("Thread B");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }
    }
}