package iamdilipkumar.com.datastructures.programs;

/**
 * Created on 12/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class MultiMin {

    public static void main(String[] args) {
        int[][] inputArray = {{1, 2, 3, 4}, {6, 4, 3, 2}, {8, 2, 1, 2}, {4, 1, 5, 2}};

        calculateMin(inputArray);
    }

    private static void calculateMin(int[][] opArray) {
        int small = 50;
        for (int i = 0; i < opArray.length; i++) {
            int[] oneItem = opArray[i];
            int[] secondItem = null;
            if (i != opArray.length - 1) {
                secondItem = opArray[i + 1];
            }
            for (int j = 0; j < oneItem.length; j++) {
                if (j == oneItem.length - 1) {
                    if (secondItem != null) {
                        small = calculateMin(oneItem[j], secondItem[j], small);
                    }
                } else {
                    small = calculateMin(oneItem[j], oneItem[j + 1], small);

                    if (secondItem != null) {
                        small = calculateMin(oneItem[j], secondItem[j], small);
                        small = calculateMin(oneItem[j], secondItem[j + 1], small);
                    }
                }

            }
        }

        System.out.println("Minimum:" + small);
    }

    private static int calculateMin(int one, int two, int min) {

        int sum = one + two;
        if (sum < min) {
            return sum;
        }

        return min;
    }
}
