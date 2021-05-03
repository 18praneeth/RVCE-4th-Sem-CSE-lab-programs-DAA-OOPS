import java.util.Scanner;

public class exercise {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String one, two;
        System.out.println("New person");
        one = in.nextLine();
        System.out.println("New name");
        two = in.nextLine();
        System.out.println(one + two);
    }
}

