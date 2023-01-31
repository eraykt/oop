package exam.abstractOrnek.final20202;

import java.util.Comparator;

public class SeatNumberComperator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        return o1.seatNumber - o2.seatNumber;
    }

}
