package iamdilipkumar.com.datastructures.basic;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * The linkedlist collection allows the operations
 * in the form of a list, deque and a queue
 *
 * Created on 13/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */
public class LinkedListData {

    public static void main(String[] args) {
        LinkedList<String> items = new LinkedList<>();
        items.add("a");
        items.add("z");
        items.add("23");
        items.add("bz");
        items.add(1, "insertion at 2");

        System.out.println("Item at the begining of the list: " + items.getFirst());

        System.out.println("Item at the End of the list: " + items.getLast());

        items.remove(0);
        System.out.println("Item at the begining of the list: " + items.getFirst());

        items.remove("z");
        System.out.println("Item at the begining of the list: " + items.getFirst());

        Iterator<String> it = items.iterator();

        while (it.hasNext()) {
            String item = it.next();

            System.out.println(item);
        }

        System.out.println("Get element at position 2: " + items.get(1));
    }
}
