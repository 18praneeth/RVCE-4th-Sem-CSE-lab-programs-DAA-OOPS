package prog8;

import java.util.*;

interface PerformOperation {
    boolean operation(int x);
}

class check{
    PerformOperation isOdd = (int a)-> a%2 != 0;
}

public class Main {
    public static void main(String[] args) {
        PerformOperation isPrime = (int a)->{
            for(int i=2; i<=a/2; i++)
                if(a%i==0)
                    return false;
            return true;
        };
        PerformOperation isPalindrome = (int a)->{
            int n = 0, t=a;
            while(t>0) {
                n *= 10;
                n += t%10;
                t /= 10;
            }
            return n == a;
        };

        Scanner in = new Scanner(System.in);

        check c = new check();


        while(true) {
            int ch=0, n=0;
            ch = in.nextInt();

            switch(ch) {
                case 1: n = in.nextInt();
                    System.out.println("isOdd " + c.isOdd.operation(n));
                    break;
                case 2: n = in.nextInt();
                    System.out.println("isPrime " + isPrime.operation(n));
                    break;
                case 3: n = in.nextInt();
                    System.out.println("isPalin " + isPalindrome.operation(n));
                    break;
                default:System.out.println("\nExit\n");
                    System.exit(1);
            }
        }
    }
}