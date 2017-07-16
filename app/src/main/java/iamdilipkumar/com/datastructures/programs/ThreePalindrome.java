package iamdilipkumar.com.datastructures.programs;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Created on 16/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class ThreePalindrome {

    private static int big;

    public static void main(String[] args) {
        big = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int number = i * j;
                if (reverseNumber(number)) {
                    System.out.println(" Values: " + i + " * " + j);
                }
            }
        }

        System.out.println("Big value: "+big);
    }

    private static boolean reverseNumber(int n) {
        int reverse = 0;
        int originalNumber = n;
        while (n != 0) {
            reverse *= 10;
            reverse += n % 10;
            n = n / 10;
        }

        if (originalNumber == reverse) {
            if(reverse>big){
                big = reverse;
            }
            System.out.print("Sum:" + originalNumber);
            return true;
        }

        return false;
    }
}
