package exam.abstractOrnek.final20202;

public abstract class Ticket {
    public int number;
    int seatNumber;

    public Ticket(int seatNumber, int number) {
        this.number = number;
        this.seatNumber = seatNumber;
    }

    public abstract void print();

    public abstract double computePrice();
}

class StandartTicket extends Ticket {

    double price;

    public StandartTicket(int seatNumber, int number) {
        super(seatNumber, number);
        price = 10;
    }

    public void print() {

    }

    public double computePrice() {
        return 0;
    }

}

class DiscountTicket extends StandartTicket {

    double discount;

    public DiscountTicket(int seatNumber, int number, double discount) {
        super(seatNumber, number);
        this.discount = discount;
    }

    @Override
    public void print() {
        System.out.println("koltuk " + seatNumber + " price " + computePrice());
    }

    @Override
    public double computePrice() {
        return price - discount;
    }

}