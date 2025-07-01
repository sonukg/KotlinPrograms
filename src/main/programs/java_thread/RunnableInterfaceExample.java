package java_thread;

public class RunnableInterfaceExample {
    public static void main(String[] args){
        RunnableThreadInterfaceDemo runnableThreadInterfaceDemo=new RunnableThreadInterfaceDemo();
        Thread thread=new Thread(runnableThreadInterfaceDemo);
        thread.start();
    }

    static class RunnableThreadInterfaceDemo implements Runnable{

        @Override
        public void run() {
            System.out.println("My Thread is running");
            try{
                System.out.println("My Thread is sleeping for 10 seconds");
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("My Thread is interrupted");
            }
            System.out.println("My Thread is exiting");
        }
    }
}
