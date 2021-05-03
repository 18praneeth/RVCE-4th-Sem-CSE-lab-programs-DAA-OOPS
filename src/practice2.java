import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Inter n:");
        int n = in.nextInt();
        int count = 0;
        int i, j, k, p;
        for (i=0; i<=9; i++){
            for (j=0; j<=9; j++){
                for (k=0; k<=9; k++){
                    for (p=0; p<=9; p++){
                        if((i+j+k+p) == n){
                            count ++;
                        }
                    }
                }
            }
        }
        System.out.println("Number of combinations is: " + count);
    }
}
