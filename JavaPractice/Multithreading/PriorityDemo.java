class PriorityTask extends Thread {
    PriorityTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityTask t1 = new PriorityTask("Low Priority");
        PriorityTask t2 = new PriorityTask("Normal Priority");
        PriorityTask t3 = new PriorityTask("High Priority");

        // Note: Thread priorities serve as advisory hints to the OS scheduler and do not guarantee execution order.
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }
    }
}