import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fileSize;
        double downloadSpeed;
        System.out.println("Enter file size (MB): ");
        fileSize = Integer.parseInt(sc.next());
        System.out.println("Enter download speed (MB/sec): ");
        downloadSpeed = Double.parseDouble(sc.next());

       DownloadTimeApp.DownloadTime(fileSize, downloadSpeed);
    }
}
