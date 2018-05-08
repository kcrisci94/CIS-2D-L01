import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedCustomersApp
{
    public static void main(String[] args)
    {
        Customer[] custArr = new Customer[3];
        Customer customer1 = new Customer("james15@yahoo.com", "James", "Doe");
        Customer customer2 = new Customer("kc145@gmail.com", "Kyle", "Barnes");
        Customer customer3 = new Customer("alext@nctv.com", "Alex", "Crisci");

        custArr[0] = customer1;
        custArr[1] = customer2;
        custArr[2] = customer3;

        Arrays.sort(custArr);
        System.out.println("\n");
        for ( Customer i : custArr ) {
            System.out.println("Email: " + i.getEmail() + "  || First Name: " + i.getFirstName() + "  || Last Name: " + i.getLastName());
        }


    }
}
