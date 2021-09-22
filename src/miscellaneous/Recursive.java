package miscellaneous;
public class Recursive {

    /**
     * Finds the maximum number in an integer array. Uses the private recursive
     * method maxrec.
     * 
     * @param arr - the array to find the maximum number in.
     * @return - the maximum number in an array.
     */
    public static int maxrec(int[] arr) {
        return maxrec(arr, arr[0], 0);
    }

    /**
     * Recusrive method that basically loops through an array and stores the highest
     * number it finds. This private method is used only for the public maxrec
     * method, the {highest} and {index} params are unnecessary for using this
     * method normally, since the values will always be the same at first.
     * ({highest} is always the arrays first index, {index} always starts from 0)
     * 
     * @param arr     - the array to find the maximum number in.
     * @param highest - the currenrly maximum number in the array. This is a
     *                parameter so it can be used with recusion.
     * @param index   - the current index in thee array it's searching through. This
     *                is a parameter so it can be used with recursion.
     * @return - the highest number from an integer array.
     */
    private static int maxrec(int[] arr, int highest, int index) {
        if (index > arr.length - 1) {
            return highest;
        }

        if (arr[index] > highest) {
            highest = arr[index];
        }

        return maxrec(arr, highest, index + 1);
    }

    /**
     * Reverses a string using recusion.
     * 
     * @param s - string to reverse.
     * @return - during recursion: the last symbol to the front + the rest of the
     *         string, this is done until the entire string is reversed and an empty
     *         string is given during recursion. When recursion is done: it returns
     *         the now fully reversed string.
     */
    public static String reverseString(String input) {
        if (input.length() > 0) {
            char lastLetter = input.charAt(input.length() - 1);
            return lastLetter + reverseString(input.substring(0, input.length() - 1));
        }

        return "";
    }

    public static String mirrorConcatinate(String s) {
        return s + reverseString(s);
    }

    private static String mirrorString(String  s) {
        if (s.length() > 0) {
            char lastLetter = s.charAt(s.length() - 1);
            return lastLetter + mirrorString(s.substring(0, s.length() - 1));
        }

        return "";
    }

    /**
     * Gives the factorial sum of a given number.
     * 
     * @param n - the factorial number to make n!.
     * @return - During recursion it returns n -1 until it's 0. During every return
     *         it's multiplied by n itself. Therefore calculating the factorial
     *         furhter by each step in recursion. When recursion is done it just
     *         returns 1.
     */
    public static int factorial(int n) {
        if (n > 1)
            return n * factorial(n - 1);
        return 1;
    }

    // I don't wanna explain this one...
    public static int factorialIterate(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // I don't wanna explain this one...
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

    /**
     * A palindrome is a word or sentence that when reversed is exactly the same.
     * This methods removes non letter characters from the string input so it can be
     * compared with a reversed String. The private methdod reverseLetters is used
     * to reverse the string. The method later compares the input string (with
     * removed symbols) and the reversed string.
     * 
     * @param input - String to that is a palindrome or not.
     * @return {true} if the input is a palindrome, {false} otherwise.
     */
    public static boolean palindromeSearch(String input) {

        StringBuilder inputLetter = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                inputLetter.append(input.charAt(i));
            }
        }
        String reversed = reverseLetters(input).toLowerCase();
        if (inputLetter.toString().toLowerCase().equals(reversed)) {
            return true;
        }

        return false;
    }

    /**
     * Reverses a string using recusion. It removes all characters that are not
     * letters.
     * 
     * @param s - string to reverse.
     * @return - during recursion: the last symbol to the front + the rest of the
     *         string, this is done until the entire string is reversed and an empty
     *         string is given during recursion. When recursion is done: it returns
     *         the now fully reversed string.
     */
    private static String reverseLetters(String s) {

        if (!(s.length() > 0)) {
            return "";
        }

        char lastSymbol = s.charAt(s.length() - 1);
        if (Character.isLetter(lastSymbol)) {
            return lastSymbol + reverseLetters(s.substring(0, s.length() - 1));
        } else {
            return reverseLetters(s.substring(0, s.length() - 1));
        }
    }

    public static String multipleReverse(String s) {
        StringBuilder lastChar = new StringBuilder();

        if(s.length() > 0) {
            for(int i = 0; i < s.length(); i++) {
                lastChar.append(s.charAt(s.length() -1));
            }

            return lastChar.toString() + multipleReverse(s.substring(0, s.length() - 1)); 
        }

        return "";
    }
}
