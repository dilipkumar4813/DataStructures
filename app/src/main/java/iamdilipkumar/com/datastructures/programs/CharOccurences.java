package iamdilipkumar.com.datastructures.programs;

/**
 * Created on 10/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class CharOccurences {

    public static void main(String args[]) {
        String inputString = "aaccccccedd"; // Input String

        System.out.println("Input String:" + inputString);
        countOccurences(inputString);
    }

    /**
     * Recursive method to count the occurrences of the character
     * at the beginning of the string
     *
     * @param countingString - The string which is used to extrac the first character
     */
    private static void countOccurences(String countingString) {
        int length = countingString.length();

        if (length == 0) {
            return;
        }

        char character = countingString.charAt(0);
        countingString = countingString.replace(String.valueOf(character), "");
        int count = length - countingString.length();

        System.out.println("Character: " + character + " occured: " + count);

        countOccurences(countingString);
    }

}
