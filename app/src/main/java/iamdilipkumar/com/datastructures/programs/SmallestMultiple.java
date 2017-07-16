package iamdilipkumar.com.datastructures.programs;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * <p>
 * Created on 16/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class SmallestMultiple {

    public static void main(String[] args) {

        int check;
        int answer = 0;
        boolean b = false;

        for (check = 20; !b; check += 20) {
            for (int i = 1; i <= 20; i++) {
                if (check % i != 0) {
                    break;
                } else if (check % i == 0 && i == 20) {
                    answer = check;
                    b = true;
                }
            }
        }

        System.out.println("The answer is " + answer);
    }
}
