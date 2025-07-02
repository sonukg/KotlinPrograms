package java_thread;

public class StaticSynchronizationExample {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread4 t2 = new MyThread4();
        MyThread5 t3 = new MyThread5();
        t1.start();
        t2.start();
        t3.start();
    }
}

class Table2 {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MyThread3 extends Thread {
    public void run() {
        Table2.printTable(1);
    }
}

class MyThread4 extends Thread {
    public void run() {
        Table2.printTable(10);
    }
}

class MyThread5 extends Thread {
    public void run() {
        Table2.printTable(100);
    }

}
