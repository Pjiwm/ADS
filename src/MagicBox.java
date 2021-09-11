import java.util.Arrays;

public class MagicBox {

    public static String generate(int n) {
        int counter = 1;
        int[][] table = new int[n][n];
        int currentY = n - 1;
        int currentX = (n + 1) / 2 - 1;
        table[currentY][currentX] = counter;
        counter++;

        while (counter <= n * n) {
            int storedX = currentX;
            int storedY = currentY;
            currentX++;
            currentY++;

            if (currentY > table.length - 1) {
                currentY = 0;
            }
            if (currentX > table.length - 1) {
                currentX = 0;
            }
            if (table[currentY][currentX] == 0) {
                table[currentY][currentX] = counter;
            } else {
                currentY = storedY;
                currentX = storedX;
                currentY--;
                table[currentY][currentX] = counter;
            }
            counter++;
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(Arrays.toString(table[i]) + "\n");
        }
        return str.toString();
    }
}
