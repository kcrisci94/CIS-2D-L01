
public class Main {
    public static void main(String[] args) {

        // create instance of Employee class
        Employee kaleb = new Employee("Kaleb", "Crisci");

        // Call 1st class method to greet display greeting with name
        System.out.println(kaleb.greeting());

        // Show initial value for each employee's weeklyHoursEarned
        System.out.println(kaleb.weeklyHoursEarned);

        // Call  2nd class method to add to number of hours earned
        // Print new value
        kaleb.addHours(8);
        System.out.println(kaleb.weeklyHoursEarned);

        kaleb.addHours(12);
        System.out.println(kaleb.weeklyHoursEarned);

        // Call 3rd class method to reset weekly hours back to 0
        kaleb.newWeek();
        System.out.println(kaleb.weeklyHoursEarned);
    }

}



