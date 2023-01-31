package exam.abstractOrnek.final20202;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TicketSeller {
    List<Ticket> tickets;
    private double incomes;

    public TicketSeller(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void Sell(Ticket ticket) {
        incomes += ticket.computePrice();
    }

    public double getIncomes() {
        return incomes;
    }
}

class TicketApp {
    public static void main(String[] args) {
        Ticket t1 = new StandartTicket(10, 2);
        Ticket t2 = new DiscountTicket(31, 10, 5);
        Ticket t3 = new DiscountTicket(52, 15, 7);
        Ticket t4 = new StandartTicket(69, 16);

        List<Ticket> list = new ArrayList<Ticket>();
        list.add(t1);
        list.add(t4);
        list.add(t3);
        list.add(t2);

        TicketSeller seller = new TicketSeller(list);
        seller.Sell(t1);
        seller.Sell(t2);
        seller.Sell(t3);
        seller.Sell(t4);

        System.out.println(seller.getIncomes());

        Collections.sort(list, new SeatNumberComperator());

        Iterator<Ticket> iterator = list.iterator();

        while (iterator.hasNext()) {
            Ticket t = iterator.next();
            System.out.println(t.seatNumber);
        }
    }
}