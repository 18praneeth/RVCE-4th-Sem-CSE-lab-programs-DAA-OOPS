import java.util.Scanner;

public class practice3{
    public static void main(String args[])
    {
        System.out.println("Enter n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 1;
        for(int i=1;c<=n;i++)
        {
            for(int j=1;j<=i && c<=n;j++)
            {
                System.out.print("$");
                c++;
            }
            System.out.print("\n");
        }
    }
}