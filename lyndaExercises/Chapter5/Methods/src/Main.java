import java.util.Scanner;

public class Main {
    //ARRAY OF MONTHS
    private static String[] months =
            {"January", "February", "March", "April", "May",
                    "June", "July", "August", "September", "October",
                    "November", "December"};

    // MAIN FUNCTION
    public static void main(String[] args) {
//        loopMonths();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a month");
            String monthName = scanner.nextLine();
            if (monthName.equals("")) {
                break;
            }
            int monthNumber = getMonthNumber(monthName);
            if (monthNumber == -1) {
                System.out.println("Month not found");
            }else {
                System.out.println(String.format("%s is month number %d", monthName, monthNumber + 1));
            }
        }
    }

    //METHOD 1
    private static void loopMonths() {
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }

    //METHOD 2
    private static int getMonthNumber(String monthName) {
        for (int i = 0; i < months.length; i++) {
            if (monthName.equalsIgnoreCase(months[i])) {
                return i;
            }
        }
        return -1;
    }

}

