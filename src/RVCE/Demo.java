package RVCE;
import CSE.ThirdSem;

class CseDept extends ThirdSem{
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

public class Demo {
    public static void main(String[] args) {
        CseDept cseDept = new CseDept();
        ThirdSem thirdSem = new ThirdSem();
        //Using Private method
        cseDept.display();
        //Public overriding
        cseDept.welcomeMessage();
        //Protected
        cseDept.methodProtected();
        //Default
        cseDept.methodDefault();



        thirdSem.welcomeMessage();
    }
}
