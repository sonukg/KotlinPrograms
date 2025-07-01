package java_thread;

public class ObjectLevelLockExample {
    public synchronized void message() {
        System.out.println("Object message : Object level lock acquired");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Object message : Object level lock released");
    }

    public synchronized void message2() {
        System.out.println("Object message2: Object level lock acquired");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Object message2: Object level lock released");
    }

    public static void main(String[] args) {
        ObjectLevelLockExample obj = new ObjectLevelLockExample();
        new Thread(() -> obj.message()).start();
        new Thread(() -> obj.message2()).start();
    }

}
