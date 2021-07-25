package prog6;
import java.util.Scanner;


class DemonetizationException extends Exception{
    float amount;
    DemonetizationException(float amount){
        this.amount = amount;
    }
    public String toString(){
        return "Deposit of Old Currency of (Rs."+ amount + ")crosses Rs.5000 and cannot be deposited";
    }
}

class Account{
    float balance;
    Account()
    {
        balance=500;
    }
    void deposit(float amount, String currency_type)
    {
        String curr = currency_type.toUpperCase();

        try{
            if(curr.equals("OLD") && amount>5000)
                throw new DemonetizationException(amount);
            balance=balance+amount;
        }
        catch(DemonetizationException e)
        {
            System.out.println(""+ e);
        }
    }
    void withdraw(float amount)
    {
        if(amount < balance && balance > 500)
        {   balance = balance - amount;
            System.out.println("Amount Withdrawn=Rs. "+amount);
        }
        else if(balance - amount<0)
            System.out.println("No min balance");
    }
    void currBalance()
    {
        System.out.println("Balance in A/c= Rs."+balance);
    }
}
public class Main  {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Account acc= new Account();
        while(true)
        {
            System.out.println("1.Deposit\n2.Current bal\n3.Withdraw\n4.Exit\nEnter your choice:");
            int ch=inp.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter the amount to be deposited");
                    float amount=inp.nextFloat();
                    System.out.println("Enter amount type");
                    String type=inp.next();
                    acc.deposit(amount,type);
                    break;
                case 2: acc.currBalance();
                    break;
                case 3: System.out.println("Enter amount to be withdrawn: ");
                    float amount1 = inp.nextFloat();
                    acc.withdraw(amount1);
                    break;
                case 4: System.exit(0);
            }
        }
    }
}
