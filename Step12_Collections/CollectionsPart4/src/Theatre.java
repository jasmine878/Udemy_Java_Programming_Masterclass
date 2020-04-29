//simple seatbooking system in a theatre
//Theatre seats are numbered with a row letter and then a
//seat number within each row

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String name;

    //LIST CAN BE A COLLECTION
    public List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.name = name;

        int lastRow = 'A' + (numRows - 1);
        System.out.println("lastRow is " + lastRow);

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
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
        int low = 0;
        int high = seats.size() - 1;

        while (low <= high) {
            System.out.print(".");

            int midIdx = (low + high) / 2;

            Seat midValue = seats.get(midIdx);

            int compareResult = midValue.getSeatNumber().compareTo(seatNumber);

            if (compareResult < 0) {
                low = midIdx + 1;
            } else if (compareResult > 0) {
                high = midIdx - 1;
            } else {
                return seats.get(midIdx).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    //for testing
    public void getSeats() {
        for (Seat seat: seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    //Inner Class
    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
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
