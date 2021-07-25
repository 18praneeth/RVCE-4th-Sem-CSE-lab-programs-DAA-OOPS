package prog7;

import java.util.LinkedList;
import java.util.Random;

class Market {
    LinkedList<String> list = new LinkedList<>();
    final int capacity = 5;
    String[] fruits ={"Apple","Orange","Grape","Watermelon"};
    Random random = new Random();
    public void produce() throws InterruptedException
    {
        while (true)
        {
            synchronized (this)
            {
                while (list.size() == capacity)
                    wait();
                String fruit = fruits[random.nextInt(4)];
                System.out.println("Farmer produced "+ fruit);
                list.add(fruit);
                notifyAll();
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException
    {
        while (true) {
            synchronized (this)
            {
                while (list.size() == 0)
                    wait();
                String val = list.removeFirst();
                System.out.println("Customer Bought "+ val);
                notifyAll();
                Thread.sleep(500);
            }
        }
    }
}

public class Main{
    public static void main(String[] args) throws InterruptedException
    {
        final Market market = new Market();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    market.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    market.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}