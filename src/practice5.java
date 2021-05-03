import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 Integers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int r1 = num1 % 10;
        int r2 = num2 % 10;
        int r3 = num3 % 10;
        if((r1 == r2) || (r1 == r3) || (r2 == r3)){
            System.out.println("True");
            System.exit(0);
        }
        System.out.println("False");
    }
}
