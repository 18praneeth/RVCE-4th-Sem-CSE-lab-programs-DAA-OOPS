package prog3;

import java.util.Scanner;

class circle
{
    double radius;
    String color;
    circle()
    {
        radius=1.0;
        color="blue";
    }
    circle(double radius)
    {
        this.radius=radius;
        color="blue";
    }
    circle(double radius,String color)
    {
        this.radius=radius;
        this.color=color;
    }
    double getarea()
    {
        return Math.PI*radius*radius;
    }
    double getradius()
    {
        return radius;
    }
    String getcolor(){return color;}
}
class cylinder extends circle{
    double height;

    double getheight()
    {         return height;
    }
    cylinder()
    {
        super();
        height=2.0;
    }
    cylinder(double height)
    {
        super();
        this.height=height;

    }
    cylinder(double height, double radius)
    {
        super(radius);
        this.height=height;
    }
    cylinder(double height,double radius, String color)
    {
        super(radius,color);
        this.height=height;
    }
    double getarea()
    {
        return ((2* Math.PI*radius*height)+(2* Math.PI*radius*radius));
    }
    double getvolume()
    {
        return (super.getarea()*height);
    }
    void display()
    {
        System.out.println("\nRadius is "+super.radius+",Height is "+height+", Color is "+super.color+",Area is "+getarea()+",Volume is "+getvolume());
    }
    void check (cylinder c1,cylinder c2,int i,int j){
        if((c1.radius==c2.radius)&& (c1.height==c2.height)&&(c1.color.equalsIgnoreCase(c2.color)))
            System.out.println("The cylinders "+(i+1)+" and "+(j+1)+"are similar");
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        cylinder[] c = new cylinder[4];
        int i;
        c[0] = new cylinder();
        c[1] = new cylinder(3.0);
        c[2] = new cylinder(3.0, 4.0, "Green");
        System.out.println("Enter the details of cylinder 4 (height , radius and color)");
        double h = s.nextDouble();
        //s.nextLine();
        double r = s.nextDouble();
        s.nextLine();
        String st = s.nextLine();
        c[3] = new cylinder(h, r, st);
        for (i = 0; i < 4; i++) {
            System.out.println("The dimensions of cylinder " + (i + 1) + " is ");
            c[i].display();

        }
        for (i = 0; i < 4; i++) {
            int j;
            for (j = i + 1; j < 4; j++) {
                c[i].check(c[i], c[j], i, j);
            }
        }


    }
}
