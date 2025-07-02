package java_thread;

class Table1 {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try { Thread.sleep(400); } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class SynchronizedMethodExample extends Thread {
    Table1 t;
    int num;

    SynchronizedMethodExample(Table1 t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.printTable(num);
    }

    public static void main(String[] args) {
        Table1 obj = new Table1();
        SynchronizedMethodExample t1 = new SynchronizedMethodExample(obj, 5);
        SynchronizedMethodExample t2 = new SynchronizedMethodExample(obj, 100);
        t1.start();
        t2.start();
    }
}
