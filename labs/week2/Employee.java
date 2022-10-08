package oop.labs.week2;

public class Employee {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    void displayInfo() {
        // prints name with social security number.
        System.out.printf("This employee's name is %s and social security number is %d\n", name, socialSecurityNumber);
    }

    void displaySalary() {
        // prints wage * working hours
        System.out.println("This employee's wage is $" + wage * workingHours);
    }
}
