package java_thread;

public class NotifyAndNotifyAllExample {
    private static Object lock = new Object();
    private static boolean dataReady = false;

    public static void main(String[] args) {
        // Producer thread
        Thread producer = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Producer: Preparing data...");
                try {
                    Thread.sleep(2000); // Simulate data preparation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dataReady = true;
                System.out.println("Producer: Data ready. Notifying all waiting consumers.");
                lock.notifyAll(); // Notify all waiting threads
            }
        });

        // Consumer 1 thread
        Thread consumer1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Consumer 1: Waiting for data...");
                while (!dataReady) {
                    try {
                        lock.wait(); // Wait until notified
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer 1: Data received. Processing data.");
                try {
                    Thread.sleep(1000); // Simulate data processing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Consumer 1: Finished processing.");
            }
        });

        // Consumer 2 thread
        Thread consumer2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Consumer 2: Waiting for data...");
                while (!dataReady) {
                    try {
                        lock.wait(); // Wait until notified
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer 2: Data received. Processing data.");
                try {
                    Thread.sleep(1500); // Simulate data processing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Consumer 2: Finished processing.");
            }
        });

        producer.start();
        consumer1.start();
        consumer2.start();
    }

}
