import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {
        //1.Collections.synchronizedList
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("C");
        namesList.add("Ruby");
        //add, remove - we don't need explicit synchronization
        //to fetch/traverse the values from this List -- we have to use explicit synchronization
        synchronized (namesList) {
            Iterator<String> it = namesList.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        }
        //2. CopyOnWriteArrayList==it's a class
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Jay");
        empList.add("John");
        empList.add("Raju");
        //we don't need explicit synchronization for any operation: add/remove/traverse
        Iterator<String> it = empList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
