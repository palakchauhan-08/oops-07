class ProcessingTask implements Runnable {
    private final String taskName;

    ProcessingTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " started");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(taskName + " interrupted");
            return;
        }

        System.out.println(taskName + " completed");
    }
}

public class RealLifeMultithreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(
            new ProcessingTask("Document Processing")
        );

        Thread t2 = new Thread(
            new ProcessingTask("Image Processing")
        );

        Thread t3 = new Thread(
            new ProcessingTask("Report Generation")
        );

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted while waiting for tasks.");
        }

        System.out.println("All tasks completed");
    }
}