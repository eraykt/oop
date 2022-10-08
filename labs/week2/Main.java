package oop.labs.week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Eray";
        e1.socialSecurityNumber = 1234;
        e1.wage = 130.5f;
        e1.workingHours = 60;

        e1.displayInfo();
        e1.displaySalary();

        Employee e2 = new Employee();

        Scanner in = new Scanner(System.in);

        System.out.println("Employee's name..:");
        e2.name = in.nextLine();
        System.out.println("Employee's social security number..:");
        e2.socialSecurityNumber = in.nextInt();
        System.out.println("Employee's wage..:");
        e2.wage = in.nextFloat();
        System.out.println("Employee's working hours..:");
        e2.workingHours = in.nextInt();

        e2.displayInfo();
        e2.displaySalary();
        in.close();

    }
}
