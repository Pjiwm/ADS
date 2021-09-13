package miscellaneous;

import Utils.AppUtils;

public class MagicBox {
    /**
     * Creates a 2D array grid and fills it with numbers. Each row (diagonal,
     * vertical or horizontal) added up to each other is the same number. The method starts at the top
     * middle and goes up by (1,1) each time and fills in the number starting from
     * one until the amount of boxes in the grid. When the next position on the grid
     * is above the X or Y axis on the grid. The new X and Y position will be X=0
     * or/and Y=0.
     * If the next position is already a filled in square the position will be reset with vector (-1, 0)
     * 
     * @param n - size of the magix box, has to be an odd number that's at least 3.
     * @return - A large multi lined String that can display the magix box.
     */
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

        return AppUtils.print2DArr(table);
    }
}
