package iamdilipkumar.com.datastructures.basic;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created on 13/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */
public class TreeSetData {

    public static void main(String[] args) {
        TreeSet<Integer> treeData = new TreeSet<>();
        treeData.add(13);
        treeData.add(5);
        treeData.add(1);
        treeData.add(5);
        treeData.add(2);

        Iterator<Integer> it = treeData.iterator();

        while (it.hasNext()) {
            Integer item = it.next();
            System.out.println("Value: " + item);
        }
    }
}
