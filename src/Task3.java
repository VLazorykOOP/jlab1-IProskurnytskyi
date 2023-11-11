import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of matrices (n <= 15): ");
        int n = scanner.nextInt();

        int[][] A = inputMatrix("A", n, scanner);

        int[][] B = inputMatrix("B", n, scanner);

        int[][] X = buildMatrixX(A, B);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);

        System.out.println("Matrix X (Result):");
        printMatrix(X);

        scanner.close();
    }

    private static int[][] inputMatrix(String matrixName, int size, Scanner scanner) {
        System.out.println("Enter matrix " + matrixName + ":");
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] buildMatrixX(int[][] A, int[][] B) {
        int size = A.length;
        int[][] X = new int[size][size];

        for (int i = 0; i < size; i++) {
            int maxB = findMax(B[i]);

            for (int j = 0; j < size; j++) {
                X[i][j] = A[i][j] * maxB;
            }
        }

        return X;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
