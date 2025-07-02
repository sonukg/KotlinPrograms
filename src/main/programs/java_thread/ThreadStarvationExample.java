package java_thread;

public class ThreadStarvationExample {
    private static final Object sharedResource = new Object();

    public static void main(String[] args) {
        // Create a high-priority thread
        Thread highPriorityThread = new Thread(() -> {
            System.out.println("High priority thread started.");
            for (int i = 0; i < 5; i++) {
                synchronized (sharedResource) {
                    System.out.println("High priority thread acquired resource. Iteration: " + i);
                    try {
                        Thread.sleep(10); // Simulate some work
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                try {
                    Thread.sleep(1); // Give a chance to other threads
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("High priority thread finished.");
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        // Create several low-priority threads
        for (int i = 0; i < 10; i++) {
            Thread lowPriorityThread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " started.");
                for (int j = 0; j < 2; j++) {
                    synchronized (sharedResource) {
                        System.out.println(Thread.currentThread().getName() + " acquired resource. Iteration: " + j);
                        try {
                            Thread.sleep(10); // Simulate some work
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    try {
                        Thread.sleep(1); // Give a chance to other threads
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " finished.");
            }, "LowPriorityThread-" + i);
            lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
            lowPriorityThread.start();
        }

        highPriorityThread.start();
    }

}
