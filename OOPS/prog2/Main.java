package prog2;

import java.util.Scanner;

class Address{
    int street_no;
    String city, state, country;

    Address(int street_no, String city, String state, String country){
        this.street_no = street_no;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Student{
    String usn, name;
    Address address;

    Student(String usn, String name, Address address){
        this.usn = usn;
        this.name = name;
        this.address = address;
    }
}

class College{
    String name;
    Address address;

    College(String name, Address address){
        this.name = name;
        this.address = address;
    }
}

class Employee{
    String id, name;
    Address address;

    Employee(String id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

public class Main {
    public static void main(String[] args) {
        int num, i;
        String usn, name, id;
        System.out.println("Enter the number of Objects");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.nextLine();

        Address addr[] = new Address[10];
        Student stud[] = new Student[10];
        College col[] = new College[10];
        Employee empl[] = new Employee[10];

        for(i=0; i<num; i++){
            System.out.println("Enter the Details of Student: " + (i+1));
            System.out.println("Name:");
            name = in.nextLine();
            System.out.println("USN:");
            usn = in.nextLine();
            System.out.println("Enter the address of " + name);
            System.out.println("1. Street Number\n2. City\n3. State\n4. Country");
            addr[i] = new Address(Integer.parseInt(in.nextLine()), in.nextLine(), in.nextLine(), in.nextLine());
            stud[i] = new Student(usn, name, addr[i]);
        }

        for(i=0; i<num; i++){
            System.out.println("Enter the Details of Employee: " + (i+1));
            System.out.println("Name : ");
            name = in.nextLine();
            System.out.println("Employee id :");
            id = in.nextLine();
            System.out.println("Enter the address of " + name);
            System.out.println("1. Street Number\n2. City\n3. State\n4. Country");
            addr[i] = new Address(Integer.parseInt(in.nextLine()), in.nextLine(), in.nextLine(), in.nextLine());
            empl[i] = new Employee(id, name, addr[i]);
        }


        for(i=0; i<num; i++){
            System.out.println("Enter the Details of College: " + (i+1));
            System.out.println("College Name : ");
            name = in.nextLine();
            System.out.println("Enter the address of " + name);
            System.out.println("1. Street Number\n2. City\n3. State\n4. Country");
            addr[i] = new Address(Integer.parseInt(in.nextLine()), in.nextLine(), in.nextLine(), in.nextLine());
            col[i] = new College(name, addr[i]);
        }

        Loop: while (true){
            System.out.println("1. Student Detail\n2. Employee Detail\n3. College Detail\nEnter your Choice");
            int var;
            var = in.nextInt();
            switch (var){
                case 1:
                    for (i=0; i<num; i++){
                        String format = "|%1$-10s|%2$-10s|%3$-40s|\n";
                        System.out.format(format, "Name", "USN", "Address");
                        System.out.format(format, stud[i].name, stud[i].usn, stud[i].address.street_no + ", " + stud[i].address.city + ", " + stud[i].address.state + ", " + stud[i].address.country);
                    }
                    break;
                case 2:
                    for (i=0; i<num; i++){
                        String format = "|%1$-10s|%2$-10s|%3$-40s|\n";
                        System.out.format(format, "Name", "Employee ID", "Address");
                        System.out.format(format, empl[i].name, empl[i].id, empl[i].address.street_no + ", " + empl[i].address.city + ", " + empl[i].address.state + ", " + empl[i].address.country);
                    }
                    break;
                case 3:
                    for (i=0; i<num; i++){
                        String format = "|%1$-15s|%2$-40s|\n";
                        System.out.format(format, "College Name", "Address");
                        System.out.format(format, col[i].name, col[i].address.street_no + ", " + col[i].address.city + ", " + col[i].address.state + ", " + col[i].address.country);
                    }
                    break;
                default:
                    break Loop;
            }

        }
    }
}
