import java.util.Arrays;

public class AppUtils {   
    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static String print2DArr(int[][] arr) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(Arrays.toString(arr[i]) + "\n");
        }
        return str.toString();
    }

    public static void line(String s) {
        System.out.println("\n******** " + s + " ********\n");
    }

}