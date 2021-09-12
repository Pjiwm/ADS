import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySorter {

    /**
     * Creates a new integer array and loops two times, for each array given via the parameters.
     * values are added to the new array.
     * The new array is being looped through and sorted.
     * The sorting process is done via bubble sorting.
     * It checks two indexes each time through looping and swaps the bigger number on the bigger index.
     * This is done until no more swappable numbers are found.
     * 
     * @param a - Array of integers, can be ordered or not.
     * @param b - Array of integers, can be ordered or not.
     * @return - a new Array of integers with the values from Array a and b, but sorted.
     */
    public static int[] sortAndCombine(int[] a, int[] b) {
        int[] returnArray = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            returnArray[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            returnArray[a.length + i] = b[i];
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < returnArray.length - 1; i++) {
                if (returnArray[i] > returnArray[i + 1]) {

                    int stored = returnArray[i + 1];
                    returnArray[i + 1] = returnArray[i];
                    returnArray[i] = stored;
                    isSorted = false;
                }
            }
        }
        return returnArray;
    }
    /**
     * Creates a new List and adds all the from the list given via the parameter.
     * Afterwards they're sorted.
     * 
     * @param a - List of Integers, can be ordered or not.
     * @param b - List of Integers, can be ordered or not.
     * @return - a new list with all values of list a and b, but sorted.
     */
    public static List<Integer> sortAndCombine(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(a);
        result.addAll(b);
        Collections.sort(result);
        return result;
    }

    /**
     * Sorts the array by checking which number is bigger in pais of 2. It loops
     * through the entire list and swaps pairs until no more swappable numbers can
     * be found.
     * 
     * @param input - integer array with unsorted numbers.
     * @return - a sorted integer array.
     */
    public static int[] bubbleSort(int[] input) {
        boolean isNotSame = true;
        while (isNotSame) {
            isNotSame = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    isNotSame = true;
                }
            }
        }
        return input;
    }
}
