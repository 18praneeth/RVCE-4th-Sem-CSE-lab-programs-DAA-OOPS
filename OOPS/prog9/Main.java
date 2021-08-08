package prog9;

import java.util.*;
class Arrays {
    ArrayList<String> list = new ArrayList<> ();
    ArrayList<String> rev_list = new ArrayList<> ();
    public void addItems(String color) {
        list.add(color);
    }
    public void displayItems() {
        if(list.size()==0)
            System.out.println("Empty list");
        else
            System.out.println("The items in the list are: " + list);

    }
    public void toArray() {
        if(list.size()==0)
            System.out.println("Empty list");
        else {
            String[] arr = new String[list.size()];
            list.toArray(arr);
            System.out.println("The array contents are: ");
            for (String str : arr)
                System.out.println(str);

        }
    }
    public void revList() {

        if(list.size()==0)
            System.out.println("Empty list");
        else {
            ArrayList<String> rev = new ArrayList<>();
            for (int i = list.size() - 1; i >= 0; i--)
                rev.add(list.get(i));
            System.out.println("The sorted array is: ");
            for (int i = 0; i < rev.size(); i++)
                System.out.print(rev.get(i) + " ");
            System.out.println("");
        }
    }
    public void getSubarray(int start, int end) {
        if(start<0 || end>list.size())
            System.out.println("Invalid indices");
        else {
            ArrayList<String> newlist = new
                    ArrayList<String>(list.subList(start, end));

            System.out.println("Segment of the list from index " +

                    start + " till index " + end + " is: " + newlist);

        }
    }
    public void sortArray() {
        if(list.size()==0)
            System.out.println("Empty list");
        else {
            Collections.sort(list);
            System.out.println("The sorted array is: " + list);
        }
    }
    @SuppressWarnings("unchecked")
    public void cloneArray() {
        if(list.size()==0)
            System.out.println("Empty list");
        else {
            ArrayList<String> clone_list = (ArrayList<String>)

                    list.clone();

            System.out.println("The cloned list is: " + clone_list);
        }
    }
}
public class Main {

    public static void main(String args[]) {
        int choice, start, end;
        String color;
        Scanner s = new Scanner(System.in);
        System.out.println("1. Add items to the list\n2. Display items of the list\n3. Convert list to array\n" + "4. Reverse List\n5. Print SubArray\n6. Sort the List\n7. Clone List");
        Arrays obj = new Arrays();
        while (true) {
            System.out.println("Enter the choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Color: ");
                    color = s.next();
                    obj.addItems(color);
                    break;
                case 2:
                    obj.displayItems();
                    break;
                case 3:
                    obj.toArray();
                    break;
                case 4:
                    obj.revList();
                    break;
                case 5:
                    System.out.println("Enter the start and end indices (0 based): ");

                    start = s.nextInt();
                    end = s.nextInt();
                    obj.getSubarray(start, end);
                    break;
                case 6:
                    obj.sortArray();
                    break;
                case 7:
                    obj.cloneArray();
                    break;
                default:
                    System.exit(0);

            }
        }
    }
}