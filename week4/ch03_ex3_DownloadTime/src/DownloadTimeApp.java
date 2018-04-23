import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DownloadTimeApp {
    public static void DownloadTime(int size, double speed) {
        double time = size / speed;
        int timeInt = (int) Math.round(time);
        int timeHour = (timeInt / 3600);
        int timeMinutes = (timeInt % 3600) / 60;
        int timeSec = ((timeInt % 3600) % 60);
        String output = "This download will take approximately "  + timeHour + " hours, " + timeMinutes + " minutes, and " + timeSec + " seconds";
        System.out.println(output);
    }
}
