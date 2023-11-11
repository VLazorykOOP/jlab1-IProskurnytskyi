import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = in.nextDouble();

        System.out.print("Enter value b: ");
        double b = in.nextDouble();

        calculateAndPrintResultType1(a, b);
        calculateAndPrintResultType2(a, b);
        calculateAndPrintResultType3(a, b);

        in.close();
    }

    private static void calculateAndPrintResultType1(double a, double b) {
        double result = a + ((a + b - 1) / (Math.pow(a, 2) + 2)) - Math.pow((a * b), 3);
        System.out.println("Result (type 1): " + result);
    }

    private static void calculateAndPrintResultType2(double a, double b) {
        double result = a + ((a + b - 1) / (Math.pow(a, 2) + 2)) - Math.pow((int) (a * b), 3);
        System.out.println("Result (type 2): " + result);
    }

    private static void calculateAndPrintResultType3(double a, double b) {
        int result = (int) (a + ((a + b - 1) / (Math.pow(a, 2) + 2)) - Math.pow((a * b), 3));
        System.out.println("Result (type 3): " + result);
    }
}
