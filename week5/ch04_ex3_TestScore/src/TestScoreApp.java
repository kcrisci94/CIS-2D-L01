import java.util.Scanner;

public class TestScoreApp
{
    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object

        String enterMore = "y";
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        do{
            int scoreTotal = 0;
            int scoreCount = 0;
            int testScore = 0;
            System.out.print("Enter number of test scores to be entered: ");
            int scoresNum = sc.nextInt();
            for( int i = 0; i < scoresNum; i++) {
                System.out.print("Enter score: ");
                testScore = sc.nextInt();
                if (testScore <= 100)
                {
                    scoreCount = scoreCount + 1;
                    scoreTotal = scoreTotal + testScore;
                }
                else if (testScore != 999) {
                    System.out.println("Invalid entry, not counted");
                    i--;
                }
            }
            double averageScore = scoreTotal / scoreCount;
            String message = "\n" +
                    "Score count:   " + scoreCount + "\n"
                    + "Score total:   " + scoreTotal + "\n"
                    + "Average score: " + averageScore + "\n";
            System.out.println(message);
            System.out.println("Enter more test scores?");
            enterMore = sc.next();

        }while (enterMore.equalsIgnoreCase("y"));



    }
}