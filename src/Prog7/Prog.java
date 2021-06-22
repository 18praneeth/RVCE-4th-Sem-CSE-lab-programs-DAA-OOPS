import java.util.ArrayList;

class market {
    ArrayList<String> fruits = new ArrayList<>();

    boolean isFull(){
        return fruits.size() >= 5;
    }

    boolean isEmpty(){
        return fruits.isEmpty();

    }


    synchronized void consume() {
        while(isEmpty())
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println( fruits.size() + "Consumer Consumed: " + fruits.get(0));
        fruits.remove(0);
        notify();

    }
    synchronized void produce(String s) {

        while(isFull())
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        fruits.add(s);
        System.out.println(fruits.size()  + "Farmer Produced: " + s);
        notify();
    }
}
class Producer implements Runnable {
    market q;
    String name;
    Thread t;
    Producer(market q, String name) {
        this.q = q;
        this.name = name;
        t = new Thread(this, "Producer");
        t.start();
    }
    public void run() {
        int i = 0;
        while(true) {
            q.produce(name);

            try {
                t.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    market q;
    Thread t;
    Consumer(market q) {
        this.q = q;

        Thread t = new Thread(this, "Consumer");
        t.start();

    }
    public void run() {
        while(true) {
            q.consume();

            try {
                t.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Prog {
    public static void main(String args[]) {
        market q = new market();
        new Producer(q, "Mango");
        new Producer(q, "Banana");
        new Producer(q, "Apple");
        new Producer(q, "Jackfruit");
        new Producer(q, "Papaya");
        new Consumer(q);
        new Consumer(q);
        new Consumer(q);
        new Consumer(q);
        new Consumer(q);
        System.out.println("Press Control-F2 to stop.");
    }
}
