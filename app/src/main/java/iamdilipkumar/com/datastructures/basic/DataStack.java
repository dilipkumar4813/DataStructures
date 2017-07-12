package iamdilipkumar.com.datastructures.basic;

import java.util.Stack;

/**
 * Created on 25/06/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class DataStack {

    private static void pushToStack(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("pushed:" + a);
    }

    private static void popToStack(Stack st) {
        int value = (Integer) st.pop();
        System.out.println("popped:" + value);
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        pushToStack(stack, 1);
        pushToStack(stack, 2);
        pushToStack(stack, 3);
        popToStack(stack);
        popToStack(stack);
    }
}
