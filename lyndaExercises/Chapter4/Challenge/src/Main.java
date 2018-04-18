import java.util.Scanner;
import java.lang.Double;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numeric value");
        String value1 = scanner.nextLine();

        System.out.println("Enter a numeric value");
        String value2 = scanner.nextLine();

        Double sum = Double.parseDouble(value1) + Double.parseDouble(value2);

        System.out.println("The answer is: " + sum);


    }
}
