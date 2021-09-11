import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ArraySorter {

    public static int[] sortAndCombine(int[] a, int[] b) {
        int[] returnArray = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++) {
            returnArray[i] = a[i];
        }

        for(int i = 0; i < b.length; i++) {
            returnArray[a.length+i] = b[i];
        }

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < returnArray.length-1; i++) {
                if(returnArray[i] > returnArray[i+1]) {

                    int stored = returnArray[i+1];
                    returnArray[i+1] = returnArray[i];
                    returnArray[i] = stored;
                    isSorted = false;
                }
            }
        }
        return returnArray;
    }

    public static List<Integer> sortAndCombine(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(a);
        result.addAll(b);
        Collections.sort(result);
        return result;
    }

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

    public static HashMap<Integer, Integer> bucketSort(int[] arr) {
        HashMap<Integer, Integer> buckets = new HashMap<Integer, Integer>();

        for(int x : arr) {
            if(!buckets.containsKey(x)) {
                buckets.put(x, 0);
            }
        }

        for(int key : arr) {
            int count = buckets.get(key);
            buckets.put(key, count+1);
        }

        return buckets;
    }
}
