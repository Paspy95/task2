import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };
        int[] diagonalArray = {array[0][4], array[1][3], array[2][2], array[3][1], array[4][0]};
        int min = diagonalArray[0];
        for (int i = 0; i < diagonalArray.length; i++) {
            if (diagonalArray[i] < min) {
                min = diagonalArray[i];
            }
        }
        System.out.println(min);
    }
}