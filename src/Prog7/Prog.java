package Prog7;

import java.util.ArrayList;


class Market{
    private ArrayList fruits = new ArrayList<>();
    private int fruitsNumber;

    public Market(int fruitsNumber){
        if(fruitsNumber > 0){
            this.fruitsNumber = fruitsNumber;
        }
        else{
            throw new IllegalArgumentException("This Argument not accepted");
        }
    }

    private synchronized boolean isFull(){
        return fruits.size() == this.fruitsNumber;
    }

    private synchronized boolean isEmpty(){
        return fruits.isEmpty();
    }

    public synchronized void farmer(String fruit){
        if(isFull()){
            System.out.println("We cannot accept more fruits at the moment!!");
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption");
            }
        }
        fruits.add(fruit);
        System.out.println("Fruit: "+ fruit+ " is added!!");
    }

    public synchronized String consumer(){
        if(isEmpty()){
            System.out.println("we don't have any goods yet!!");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption Occurred!!");
            }
        }
        String currentFruitRecusted = (String) fruits.remove(0);
        notifyAll();
        return currentFruitRecusted;
    }

}

public class Prog {
    public static void main(String[] args) {
        Market superMarket = new Market(10);
        superMarket.farmer("Apple");
        superMarket.farmer("Orange");
        superMarket.farmer("Watermelon");
        superMarket.farmer("Apple");
        superMarket.farmer("Orange");
        System.out.println(superMarket.consumer());
        System.out.println(superMarket.consumer());
        System.out.println(superMarket.consumer());
        System.out.println(superMarket.consumer());
        System.out.println(superMarket.consumer());
        System.out.println(superMarket.consumer());
    }
}
