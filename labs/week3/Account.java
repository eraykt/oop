package labs.week3;

public class Account {
    private double balance;
    private String ownerName;

    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
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
