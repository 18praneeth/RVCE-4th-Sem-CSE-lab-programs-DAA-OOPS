package Prog5;

interface Animal
{
    void eat();
    void sound();
}

interface TiredAnimal extends Animal
{
    void action();
}

class Lion implements TiredAnimal
{
    public void eat()
    {
        System.out.println("Hunting");
    }
    public void sound()
    {
        System.out.println("Roaring");
    }
    public void action()
    {
        System.out.println("Roaming");
    }
}

class Snake implements TiredAnimal
{
    public void eat()
    {
        System.out.println("Snake: Swallowing");
    }
    public void sound()
    {
        System.out.println("Snake: Hissing");
    }
    public void action()
    {
        System.out.println("Snake: Sleeping");
    }
}

public class prog5
{
    public static void main(String[] args)
    {
        Lion l1 = new Lion();
        Snake s1 = new Snake();
        l1.eat();
        l1.sound();
        l1.action();
        s1.eat();
        s1.sound();
        s1.action();
    }
}