import java.util.Scanner;

public class practice6{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int array[][], m, n, key, b, c;
        System.out.println("Enter dimensions of matrix:");
        m = in.nextInt();
        n = in.nextInt();
        array = new int[m][n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the key to be searched:");
        key = in.nextInt();
        for(b=0;b<m-1;b++){
            if(key>=array[b][0] && key<array[b+1][0])
                break;
        }
        for(c=0;c<n;c++)
        {
            if(key==array[b][c])
            {
                System.out.println("Element found at " + (b+1) + " row "+ (c+1) + " col ");
                break;
            }
        }
        if(b==m-1 && c==n)
        {
            System.out.println("Element not found");
        }
    }
}