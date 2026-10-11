public class ThreadLifecycle {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                // Thread transitions to TIMED_WAITING during sleep
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Restore interrupted status
                Thread.currentThread().interrupt();
                System.out.println("Worker thread interrupted.");
            }
        });

        // 1. NEW: Thread object created, start() has not been called
        System.out.println("State after creation: " + thread.getState());

        // 2. RUNNABLE: Thread started and executing (or ready to execute)
        thread.start();
        System.out.println("State after starting: " + thread.getState());

        // 3. TIMED_WAITING: Thread is sleeping
        try {
            Thread.sleep(100);
            System.out.println("State during sleep: " + thread.getState());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted while observing worker.");
        }

        // 4. TERMINATED: Thread has finished run()
        try {
            thread.join();
            System.out.println("State after completion: " + thread.getState());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted while waiting for worker termination.");
        }
    }
}
