package java_thread;

public class VolatileExample {
    private static volatile boolean running = true;

    public static void main(String[] args) {
        new Thread(() -> {
            while (running) {
                System.out.println("Thread is running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted.");
                }
            }
            System.out.println("Thread stopped.");
        }).start();

        try {
            Thread.sleep(2000); // Let the thread run for 2 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        running = false; // Change the volatile variable to stop the thread
        System.out.println("Main thread set running to false.");
    }

}
