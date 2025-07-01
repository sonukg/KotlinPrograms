package java_thread;

public class WaitExample {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread producer = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Producer: Acquired lock. Producing data...");
                try {
                    Thread.sleep(2000); // Simulate data production
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Producer: Data produced. Notifying consumer...");
                lock.notify(); // Notify waiting consumer
                System.out.println("Producer: Released lock.");
            }
        });

        Thread consumer = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Consumer: Acquired lock. Waiting for data...");
                try {
                    lock.wait(); // Wait until notified
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Consumer: Notified. Consuming data...");
                try {
                    Thread.sleep(1000); // Simulate data consumption
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Consumer: Data consumed. Released lock.");
            }
        });

        producer.start();
        consumer.start();
    }

}
