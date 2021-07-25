package prog10;

import java.util.*;

public class penultimate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a sentence: ");
        String inp = in.nextLine();
        String words[] = inp.split(" ");

        System.out.println("Penultimate word is: " + words[words.length - 2]);

        in.close();

    }
}