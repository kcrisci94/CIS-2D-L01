import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        String value1 = sc.nextLine();

        System.out.print("Enter a numeric value: ");
        String value2 = sc.nextLine();

        System.out.print("Choose an option (+ - * /): ");
        String option = sc.nextLine();

        switch(option) {
            case "+":
                addition(value1, value2);
                break;
            case "-":
                subtraction(value1, value2);
                break;
            case "*":
                multiplication(value1, value2);
                break;
            case "/":
                division(value1, value2);
        }

    }
    private static void addition(String x, String y) {
        double value1 = Double.parseDouble(x);
        double value2 = Double.parseDouble(y);

        System.out.println(value1 + value2);
    }
    private static void subtraction(String x, String y) {
        double value1 = Double.parseDouble(x);
        double value2 = Double.parseDouble(y);

        System.out.println(value1 - value2);

    }
    private static void multiplication(String x, String y) {
        double value1 = Double.parseDouble(x);
        double value2 = Double.parseDouble(y);

        System.out.println(value1 * value2);

    }
    private static void division(String x, String y) {
        double value1 = Double.parseDouble(x);
        double value2 = Double.parseDouble(y);

        System.out.println(value1 / value2);

    }
}
