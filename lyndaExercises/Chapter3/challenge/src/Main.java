import java.awt.*;
import java.lang.String;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        Dice d = new Dice();
        int roll1;
        int roll2;
        System.out.println("Type 'roll' to roll the dice...");
        Scanner n = new Scanner(System.in);
        String begin = n.nextLine();
        if(begin.equals("roll")) {
            roll1 = d.roll();
            roll2 = d.roll();
            System.out.println("Roll 1: " + roll1);
            System.out.println("Roll 2: " + roll2);
            System.out.println();
            System.out.print("You rolled a total of " + d.addRolls(roll1, roll2));

        }else {
            System.out.println("Invaid Entry");
        }

    }
}
