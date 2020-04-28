//simple seatbooking system

import java.util.ArrayList;

public class Theatre {
    private final String name;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.name = name;

        int lastRow = "A" + (numRows - 1);

        for (char row = "A"; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("402d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestSeat = null;

        for (Seat seat: seats) {
            if (seat.getSeatNumer().equals(seatNumber)) {
                requestSeatedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);;
            return false;
        }

        return requestedSeat.reserve();
    }

    //for testing
    public void getSeats() {
        for (Seat seat: seats) {
            System.out.println(seat.getSeatNumber());
        }
    }
}
