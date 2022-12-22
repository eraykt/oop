package labs.week11;

import java.util.ArrayList;
import java.util.Iterator;

public class BankAccount {
    int accountNo;
    String holderName;
    double balance;

    public BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void balanceChange(double balance) {
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return accountNo + " " + holderName + " " + balance;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1, "eray", 1000);
        BankAccount a2 = new BankAccount(2, "tolga", 500);
        BankAccount a3 = new BankAccount(3, "semih", 1500);

        ArrayList<BankAccount> myArrayList = new ArrayList<BankAccount>();
        myArrayList.add(a1);
        myArrayList.add(a2);
        myArrayList.add(a3);

        Iterator<BankAccount> iter = myArrayList.iterator();

        while (iter.hasNext()) {
            var a = iter.next();
            a.balanceChange(500);
            System.out.println(a);
        }

    }

}
