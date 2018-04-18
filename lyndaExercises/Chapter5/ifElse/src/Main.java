public class Main {
    public static void main(String[] args) {
        int monthNumber = 4;


        if (monthNumber >= 0 && monthNumber <= 2) {
            System.out.println("You're in Quarter 1");
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("You're in Quarter 2");
        } else {
            System.out.println("It's the 2nd half of the year");
        }
    }
}

