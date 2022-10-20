package labs.week3;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("eray", 100);

        acc1.add(-2);

        double money = acc1.getBalance();
        System.out.println("current money: " + money);

        acc1.withdraw(25);
        money = acc1.getBalance();
        System.out.println("current money: " + money);

        System.out.println("old name: " + acc1.getOwnerName());

        acc1.setOwnerName("tolga");
        System.out.println("new name: " + acc1.getOwnerName());
    }
}
