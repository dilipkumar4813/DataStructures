package iamdilipkumar.com.datastructures.programs;

import static java.lang.Math.sqrt;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * Created on 16/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class PrimeFactors {

    public static void main(String[] args) {
        printPrime(600851475143L);
    }

    private static void printPrime(long n) {
        n = checkValue(2, n);

        for (int i = 3; i <= sqrt(n); i = i + 2) {
            n = checkValue(i, n);
        }

        if (n > 2) {
            System.out.printf("%d ", n);
        }
    }

    private static long checkValue(int i, long n) {
        // While i divides n, print i and divide n
        while (n % i == 0) {
            System.out.println("" + i);
            n = n / i;
        }

        return n;
    }
}
