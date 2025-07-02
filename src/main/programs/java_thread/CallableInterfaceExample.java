package java_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterfaceExample {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            System.out.println("Task is running");
            Thread.sleep(1000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Result: " + future.get());
        executor.shutdown();

        System.out.println("------------------------------------------------------");

        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        Future<String> future1 = executor1.submit(new CallableThreadInterfaceDemo());
        System.out.println("Result: " + future1.get());
        executor1.shutdown();


    }
}

 class CallableThreadInterfaceDemo implements Callable<String> {

    @Override
    public String call() {
        System.out.println("My Callable Thread is running");
        try {
            System.out.println("My Callable Thread is sleeping for 1 second");
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("My Callable Thread is interrupted");
        }
        System.out.println("My Callable Thread is exiting");
        return "Callable Result";
    }
}
