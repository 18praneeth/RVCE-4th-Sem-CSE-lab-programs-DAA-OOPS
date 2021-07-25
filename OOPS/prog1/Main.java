package prog1;
import java.util.Scanner;

class Complex {

    int real, imaginary;

    Complex()
    {
    }

    Complex(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }

    Complex addComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;

        return temp;
    }

    Complex subtractComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;

        return temp;
    }

    void printComplexNumber()
    {
        System.out.println("Complex number: "
                + real + " + "
                + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Real and Imaginary part of 1st complex number: ");
        int tempReal = in.nextInt();
        int tempImaginary = in.nextInt();
        Complex C1 = new Complex(tempReal, tempImaginary);
        C1.printComplexNumber();


        System.out.println("Enter Real and Imaginary part for 2nd complex number");
        tempReal = in.nextInt();
        tempImaginary = in.nextInt();
        Complex C2 = new Complex(tempReal, tempImaginary);
        C2.printComplexNumber();

        Complex C3 = new Complex();
        C3 = C3.addComp(C1, C2);
        System.out.print("Sum of ");
        C3.printComplexNumber();

        C3 = C3.subtractComp(C1, C2);
        System.out.print("Difference of ");
        C3.printComplexNumber();
    }
}
