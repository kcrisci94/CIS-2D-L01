import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double doubleValue = 1_234_567.89;

        //USE getNumberInstance() to get value as it's written
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

        //USE getIntegerInstance() to return value as an integer
        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));

        //USE .setGroupingUsed(true or false) to output without commas
        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));

        //USE Locale to change the language of the output
        Locale locale = new Locale("de", "DE");
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(localFormat.format(doubleValue));

        //USE getCurrencyInstance() to get output as a currency
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormat.format(doubleValue));

        //USE DecimalFormat to specify a pattern to display information
        //HASHTAGS TELL COMPILER TO ONLY ADD VALUES IF THEY ARE NEEDED
        DecimalFormat df = new DecimalFormat("$##0.00#");
        System.out.println(df.format(1));
        System.out.println(df.format(5.391));

    }

}
