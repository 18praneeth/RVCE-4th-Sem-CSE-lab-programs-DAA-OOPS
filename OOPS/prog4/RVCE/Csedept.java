package prog4.RVCE;
import prog4.CSE.Thirdsem;

class cse_department extends Thirdsem{
    public void welcomeMessage(){
        System.out.println("Public Method is overriding\n Welcome to CSE Department");
    }
    protected void methodProtected(){
        System.out.println("Protected Method is overriding");
    }
    void methodDefault(){
        System.out.println("Default Method overriding");
    }
    private void methodPrivate(){
        System.out.println("Private Method");
    }
    public void display(){
        System.out.println("Inside the Display");
        System.out.println("Calling private method: ");
        methodPrivate();
    }
}

public class Csedept {
    public static void main(String[] args) {
        cse_department csedepartment = new cse_department();
        Thirdsem thirdSem = new Thirdsem();
        //Using Private method
        csedepartment.display();
        //Public overriding
        csedepartment.welcomeMessage();
        //Protected
        csedepartment.methodProtected();
        //Default
        csedepartment.methodDefault();

        thirdSem.welcomeMessage();
    }
}
