public class Main {
    private static String[] months =
            {"January", "February", "March", "April", "May",
                    "June", "July", "August", "September", "October",
                    "November", "December"};
    public static void main(String[] args) {
        // FOR LOOP
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }
        // FOR EACH LOOP
//        for (String month : months) {
//            System.out.println(month);
//        }

        // WHILE LOOP
//        int counter = 0;
//        while (counter < months.length) {
//            System.out.println(months[counter]);
//            counter++;
//        }

        // DO WHILE LOOP
        int counter = 0;
        do {
            System.out.println(months[counter]);
            counter++;

            if (counter == 5) {
                break;
            }
        } while (counter < months.length);


    }

}
