class MatrixMultiplier extends Thread {
    private int row;
    private int[][] A;
    private int[][] B;
    private int[][] result;

    public MatrixMultiplier(int row, int[][] A, int[][] B, int[][] result) {
        this.row = row;
        this.A = A;
        this.B = B;
        this.result = result;
    }

    @Override
    public void run() {
        for (int j = 0; j < B[0].length; j++) {
            int sum = 0;
            for (int k = 0; k < B.length; k++) {
                sum += A[row][k] * B[k][j];
            }
            result[row][j] = sum;
        }
    }
}

public class ex4 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int rowsA = A.length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        Thread[] threads = new Thread[rowsA];

        for (int i = 0; i < rowsA; i++) {
            threads[i] = new MatrixMultiplier(i, A, B, result);
            threads[i].start();
        }


        for (int i = 0; i < rowsA; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Result:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}