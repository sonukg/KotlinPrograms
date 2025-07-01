package java_thread;

public class DeamonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Daemon thread is running...");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Daemon thread interrupted.");
                    break;
                }
            }
        });
        daemonThread.setName("Daemon Thread");
        daemonThread.setPriority(Thread.NORM_PRIORITY);
        daemonThread.setDaemon(true); // Set the thread as a daemon thread

        Thread userThread = new Thread(() -> {
            try {
                System.out.println("User thread is running...");
                Thread.sleep(2000); // User thread sleeps for 2 seconds
                System.out.println("User thread finished its execution.");
            } catch (InterruptedException e) {
                System.out.println("User thread interrupted.");
            }
        });

        daemonThread.start();
        userThread.start();

        System.out.println("Main thread finished.");
    }


}
