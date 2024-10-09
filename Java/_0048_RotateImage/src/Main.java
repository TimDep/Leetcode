import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {2, 29, 20, 26, 16, 28},
                {12, 27, 9, 25, 13, 21},
                {32, 33, 32, 2, 28, 14},
                {13, 14, 32, 27, 22, 26},
                {33, 1, 20, 7, 21, 7},
                {4, 24, 1, 6, 32, 34}
        };

        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int i =0;
        int j=0;
        while (i < matrix.length -1-j) {
            int temp = matrix[i][matrix.length-1-j];
            matrix[i][matrix.length-1-j] = matrix[j][i];
            int temp2 = matrix[matrix.length-1-j][matrix.length-1-i];
            matrix[matrix.length-1-j][matrix.length-1-i] = temp;
            temp = matrix[matrix.length-1-i][j];
            matrix[matrix.length-1-i][j] = temp2;
            matrix[j][i] = temp;
            i++;
            if (i==matrix.length -1-j) {
                j++;
                i=j;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}