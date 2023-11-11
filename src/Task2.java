import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value b (b > a): ");
        double b = scanner.nextDouble();

        System.out.print("Enter size of array (n <= 200): ");
        int n = scanner.nextInt();

        double[] X = new double[n];

        System.out.println("Enter elements of array X:");
        for (int i = 0; i < n; i++) {
            System.out.print("X[" + (i + 1) + "]: ");
            X[i] = scanner.nextDouble();
        }

        calculateAndPrintResults(a, b, X);

        scanner.close();
    }

    private static void calculateAndPrintResults(double a, double b, double[] X) {
        double sumXLessThanA = 0;
        double productXGreaterThanB = 1;
        double maxX = X[0];
        double minX = X[0];

        for (double xi : X) {
            if (xi < a) {
                sumXLessThanA += xi;
            } else if (xi > b) {
                productXGreaterThanB *= xi;
            }

            if (xi >= a && xi <= b) {
                if (xi > maxX) {
                    maxX = xi;
                }
                if (xi < minX) {
                    minX = xi;
                }
            }
        }

        System.out.println("Sum X(i) < a: " + sumXLessThanA);
        System.out.println("Product X(i) > b: " + productXGreaterThanB);
        System.out.println("Max value X(i) in range [a, b]: " + maxX);
        System.out.println("Min value X(i) in range [a, b]: " + minX);
    }
}
