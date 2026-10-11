class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        NumberTask task = new NumberTask();
        Thread t = new Thread(task);
        t.start();
    }
}