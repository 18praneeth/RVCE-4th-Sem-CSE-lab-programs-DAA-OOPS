import java.util.Scanner;

public class practice4{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        System.out.println("Enter the array Elements: ");
        int i;
        int j = 0, k = 0;
        int count1 = 0;
        int count2 = 0;
        int[] a = new int[100];
        for(i=0;i<n;i++)
            a[i]=in.nextInt();

        int[] b = new int[100];
        int[] c = new int[100];

        for(i=0;i<n;i++){
            if(a[i]%2!=0){
                b[j++]=a[i];
                count1++;}
            else{
                count2++;
                c[k++]=a[i];
            }
        }

        for(j=0,i=0;i<count1;i++)
            a[j++]=b[i];
        for(i=0;i<count2;i++)
            a[j++]=c[i];
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }}