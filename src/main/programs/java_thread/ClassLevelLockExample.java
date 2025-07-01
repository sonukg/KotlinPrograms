package java_thread;

public class ClassLevelLockExample {
    public static synchronized void message() {
        System.out.println("Static message : Class level lock acquired");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Static message : Class level lock released");
    }

    public static synchronized void message2() {
        System.out.println("Static message2: Class level lock acquired");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Static message2: Class level lock released");
    }

    public static void main(String[] args) {
        new Thread(() -> message()).start();
        new Thread(() -> message2()).start();
    }

}
