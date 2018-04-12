
// Create employee class
public class Employee {

    //ATTRIBUTES
    String firstName;
    String lastName;
    double weeklyHoursEarned;

    //Create the constructor for creating new employees
    public Employee(String getFirstName,
                    String getLastName) {
        this.firstName = getFirstName;
        this.lastName = getLastName;
    }

    // METHODS
    public String greeting() {
        return ("Hello, My name is " + this.firstName + " " + this.lastName + "!");
    }
    public void addHours(int hours) {
        this.weeklyHoursEarned += hours;
    }
    public void newWeek() {
        this.weeklyHoursEarned = 0;
    }
}
