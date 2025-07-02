package java_thread;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        // Creating objects
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();

        // Nullifying references to make objects eligible for GC
        obj1 = null;
        obj2 = null;

        // Requesting JVM to run the garbage collector
        System.gc();

        System.out.println("Garbage collection requested.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GarbageCollectionExample object finalized.");
    }

}
