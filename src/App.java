import java.util.Arrays;

import Polynoom.Polynomial;
import Polynoom.PolynomialFactory;
import Polynoom.Term;

public class App {
    public static void main(String[] args) throws Exception {

        int[] array = { 9, 1, 3, 7, 4, 10, 6, 5, 19, 12, 15, 13, 300, 20, 11, 3, 1, 1, 30, 40, 50, 44, 9 };
        int[] orderedArray = { 1, 4, 7, 11, 15, 20, 30, 44, 60, 90, 100, 104, 110 };
        int[] a = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        int[] b = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
        line("recursive");
        System.out.println(Recursive.maxrec(array));
        System.out.println(Recursive.binarySearch(orderedArray, 7));
        System.out.println(Recursive.reverseString("these nuts"));
        line("array sorting");
        printArr(ArraySorter.bubbleSort(array));

        line("array Polynomial");
        System.out.println(PolynomialFactory.addPolynomials());

    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void line(String s) {
        System.out.println("\n******** " + s + " ********\n");
    }

}
