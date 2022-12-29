package labs.week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class BankAccount implements Comparable<BankAccount> {
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

    @Override
    public int compareTo(BankAccount o) {
        return accountNo - o.accountNo;
    }

    public static void main(String[] args) {
        BankAccount a3 = new BankAccount(3, "semih", 1500);
        BankAccount a1 = new BankAccount(1, "eray", 1000);
        BankAccount a2 = new BankAccount(2, "tolga", 500);

        ArrayList<BankAccount> myArrayList = new ArrayList<BankAccount>();
        myArrayList.add(a1);
        myArrayList.add(a2);
        myArrayList.add(a3);

        Collections.sort(myArrayList, Collections.reverseOrder(new BalanceComp()));
        System.out.println(myArrayList);

        Iterator<BankAccount> iter = myArrayList.iterator();

        while (iter.hasNext()) {
            var a = iter.next();
            a.balanceChange(500);
            System.out.println(a);
        }
    }
}

class StringComp implements Comparator<BankAccount> {

    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return o1.holderName.compareTo(o2.holderName);
    }
}

class BalanceComp implements Comparator<BankAccount> {

    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return (int) (o1.balance - o2.balance);
    }
}