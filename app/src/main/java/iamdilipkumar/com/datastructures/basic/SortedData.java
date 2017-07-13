package iamdilipkumar.com.datastructures.basic;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created on 13/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */
public class SortedData {

    public static void main(String[] args) {
        SortedSet<String> sortedItems = new TreeSet();
        sortedItems.add("d");
        sortedItems.add("b");
        sortedItems.add("z");
        sortedItems.add("a");

        Iterator it = sortedItems.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println("Element: " + element.toString());
        }

        // Get the first item
        System.out.println("First: " + sortedItems.first());

        // Get the last item
        System.out.println("Last: " + sortedItems.last());


    }
}
