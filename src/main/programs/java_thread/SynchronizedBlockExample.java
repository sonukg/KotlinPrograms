package java_thread;

public class SynchronizedBlockExample {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread t1 = new MyThread(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}

class Table {
    void printTable(int n) {
        // synchronized block
        synchronized (this) {
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
}

class MyThread extends Thread {
    Table t;

    MyThread(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }

}
