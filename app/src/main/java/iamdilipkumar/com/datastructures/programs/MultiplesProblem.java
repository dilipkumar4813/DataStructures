package iamdilipkumar.com.datastructures.programs;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * <p>
 * Created on 16/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class MultiplesProblem {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
