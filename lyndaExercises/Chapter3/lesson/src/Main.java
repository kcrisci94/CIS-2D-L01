import java.awt.*;
import java.lang.reflect.Array;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        /*
        ** IF/THEN STATEMENT FOR AGES
        *
        System.out.println("Enter an age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age >= 0 && age <=5) {
            System.out.println("Baby");

        }else if(age >= 6 && age <= 11) {
            System.out.println("Kid");
        }else if(age >= 12 && age <= 17) {
            System.out.println("Teen");
        }else if(age >= 18) {
            System.out.println("Adult");
        }else {
            System.out.println("Invalid");
        }
        System.out.println("Thanks for using this program");
        */

        /*
        //WHILE LOOP
        System.out.println("While Loop");
        int x = 3;
        while(x > 0) {
            System.out.println("Current x: " + x);
            x--;
        }
        System.out.println("Final x: " + x);
        System.out.println();
        */

        /*
        // DO WHILE LOOP
        System.out.println("Do-While Loop");
        int y = 3;
        do {
            System.out.println("Current y: " + y);
            y--;
        }while(y > 0);
        System.out.println("Final y: " + y);
        System.out.println();
        */

        /*
        // FOR LOOP
        System.out.println("For Loop");
        for(int i = 3; i > 0; i--) {
            System.out.println("Current i: " + i);
        }
        System.out.println();
        */

        /*
        // USING MATH FUNCTION
        //Power Function
        double power = Math.pow(5,3);
        System.out.println(power);

        //Square Root function
        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);

        // Random Number function
        // Must import Random utility
        Random rand = new Random();
        // random number
        int randomNumber = rand.nextInt();

        // random number between 0 and 10
        int randomNumberWithBound = rand.nextInt(10);
        System.out.println(randomNumber);
        System.out.println(randomNumberWithBound);
        */

        Coin c = new Coin();
        System.out.println("initial: " + c.getFaceUp());
        for(int i = 0; i < 10; i++) {
            c.flip();
            System.out.println("After Flip: " + c.getFaceUp());
        }
    }

}
