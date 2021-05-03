import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Seconds: ");
        int sec = in.nextInt();
        int seconds = sec % 60;
        int hour = sec / 60;
        int min = hour % 60;
        hour = hour / 60;
        System.out.println("H:" + hour + " M:" + min + " S:" + seconds);
    }
}