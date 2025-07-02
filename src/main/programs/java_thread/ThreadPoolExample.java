package java_thread;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(3);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " started by thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " finished by thread: " + Thread.currentThread().getName());
            });
        }

        // Shut down the executor. This will allow previously submitted tasks to execute,
        // but will not accept new tasks.
        executor.shutdown();

        // Wait until all tasks are finished
        try {
            executor.awaitTermination(1, java.util.concurrent.TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks submitted to the thread pool are completed.");
    }

}
