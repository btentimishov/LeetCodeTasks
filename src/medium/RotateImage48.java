package medium;

public class RotateImage48 {
    public static void main(String[] args) {

    }


    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(matrix[i], 0, map[i], 0, n);
        }


        int k = 0;
        int m = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = map[k][m];

                m++;
            }
            k++;
        }


    }
}
