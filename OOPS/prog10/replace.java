package prog10;

import java.util.*;
public class replace {
    public static void main(String[] args) {
        System.out.println("Enter the sentence: ");
        Scanner in = new Scanner(System.in);

        String inp = in.nextLine();

        in.close();

        String words[] = inp.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().equals("java"))
                words[i] = "Python";
            else if (words[i].toLowerCase().equals("python"))
                words[i] = "Java";

            System.out.print(words[i] + " ");
        }
    }
}