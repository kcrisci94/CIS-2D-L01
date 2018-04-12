import java.util.Random;

public class Dice {

    private int diceRoll;

    public int roll() {
        Random number = new Random();
        diceRoll = number.nextInt(6) + 1;
        return diceRoll;
    }

    public int addRolls(int roll1, int roll2) {
        int sum = roll1 + roll2;
        return sum;
    }
}
