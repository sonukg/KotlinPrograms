package java_thread;

public class BlockingQueueExampleUsingProducerConsumer {
    public static void main(String[] args) {
        java.util.concurrent.BlockingQueue<Integer> queue = new java.util.concurrent.ArrayBlockingQueue<>(10);


        Runnable producer = () -> {
            try {
                for (int i = 0; i < 20; i++) {
                    Thread.sleep(100);
                    queue.put(i);
                    System.out.println("Produced: " + i + ", Queue size: " + queue.size());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };


        Runnable consumer = () -> {
            try {
                while (true) {
                    Thread.sleep(200);
                    Integer value = queue.take();
                    System.out.println("Consumed: " + value + ", Queue size: " + queue.size());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }

}
