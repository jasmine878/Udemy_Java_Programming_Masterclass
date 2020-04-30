//simple seatbooking system in a theatre
//Theatre seats are numbered with a row letter and then a
//seat number within each row

import java.util.*;

public class Theatre {
    private final String name;

    //LIST CAN BE A COLLECTION
    private List<Seat> seats = new ArrayList<>();

    //this is an anonymous inner class implementing a comparator and
    //it's providing an implementation of a single "compare" method
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            //we're sorting by the price of the ticket
            //returns -1 if the price of seat1 < seat 2
            //returns 1 if the price of seat 1 > seat 2
            //returns 0 if the price of seat 1 == seat 2
            if(seat1.getPrice() < seat2.getPrice()) {
                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.name = name;

        int lastRow = 'A' + (numRows - 1);
        System.out.println("lastRow is " + lastRow);

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;

                if (row < 'D' && seatNum >= 4 && seatNum <= 9) price = 14.00;
                if (row > 'F' || seatNum < 4 || seatNum > 9) price = 7;

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return this.name;
    }

    //source code for binary search that comes with Java
    //we want to see what is happening behind the scenes
    public boolean reserveSeat(String seatNumber) {
        //use requestedSeat for comparison purposes
        Seat requestedSeat = new Seat(seatNumber, 0);

        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);

        if (foundSeat >= 0) return seats.get(foundSeat).reserve();
        else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    //for testing
    public Collection<Seat> getSeats() {
        return seats;
    }

    //Inner Class
    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
