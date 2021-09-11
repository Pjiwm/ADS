public class Recursive {
    public static int maxrec(int[] arr) {
        return maxrec(arr, 0, 0);
    }
    // returns highest int
    private static int maxrec(int[] arr, int highest, int index) {
        if (index > arr.length - 1) {
            return highest;
        }

        if (arr[index] > highest) {
            highest = arr[index];
        }

        return maxrec(arr, highest, index + 1);
    }

    public static String reverseString(String input) {
        if (input.length() > 0) {
            char lastLetter = input.charAt(input.length() - 1);
            return lastLetter + reverseString(input.substring(0, input.length() - 1));
        }

        return "";
    }

    public static int factorial(int n) {
        if (n > 1)
            return n * factorial(n - 1);
        return 1;
    }

    public static int factorialIterate(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static int fibonacci(int n) {
        if (n > 2) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return 1;
    }

    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, arr.length - 1, arr[0], 0);
    }

    private static int binarySearch(int[] arr, int target, int highest, int lowest, int foundIndex) {
        int center = (highest + lowest) / 2;
        // not in array
        if (highest == lowest) {
            return -1;
        }
        if (arr[center] < target) {
            return binarySearch(arr, target, highest, center, 0);
        } else if (arr[center] > target) {
            return binarySearch(arr, target, center, lowest, 0);
        }
        // target
        return highest - lowest;
    }

}
