package labs.week3;

// import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;
    private int password = 1234;

    public boolean suspended;

    public Account(String name, double balance) {
        System.out.println("please enter the 4-digit pass.");

        // Scanner sc = new Scanner(System.in);
        int inPass = 0;

        int fail = -1;

        while (inPass != password) {
            fail++;
            // inPass = sc.nextInt();

            if (fail == 2) {
                System.out.println("your account has been suspended!");
                suspended = true;
                return;
            }
        }

        this.ownerName = name;
        this.balance = balance;
        // sc.close();
    }

    public void add(double amount) {
        if (amount < 0) {
            System.out.println("eklemek istediginiz tutar 0 dan buyuk olmali.");
            return;
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
