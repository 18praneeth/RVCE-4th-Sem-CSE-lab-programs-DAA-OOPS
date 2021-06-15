//package Prog7;
//import java.util.*;
//
//class Market
//{
//    ArrayList<String> fruits = new ArrayList<> ();
//    int n;
//    public Market(int n)
//    {
//        if (n > 0)
//        {
//            this.n = n;
//        }
//        else
//        {
//            throw new IllegalArgumentException("Invalid Input");
//        }
//    }
//
//    private synchronized boolean isfull()
//    {
//        boolean b = (fruits.size() == this.n);
//        return b;
//    }
//
//    private synchronized boolean isempty()
//    {
//        return fruits.isEmpty();
//    }
//
//    public synchronized void farmer()
//    {
//        Scanner scan = new Scanner(System.in);
//        if (isfull())
//        {
//            System.out.println("Queue is full");
//
//        }
//        else
//        {
//            System.out.println("Enter the fruit to be added: ");
//            String s = scan.nextLine();
//            fruits.add(s);
//            System.out.println("Fruit " + s + " is added\n");
//            notify();
//        }
//    }
//
//    public synchronized void consumer()
//    {
//        if (isempty())
//        {
//            System.out.println("Queue is empty");
//        }
//        else
//        {
//            String s = fruits.remove(0);
//            System.out.println("Current fruit requested is " + s);
//            notifyAll();
//        }
//    }
//}
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Scanner scan=new Scanner(System.in);
//        Market m = new Market(3);
//        m.farmer();
//        m.farmer();
//        m.consumer();
//        m.farmer();
//        m.farmer();
//        m.consumer();
//        m.consumer();
//        m.consumer();
//        m.consumer();
//    }
//}