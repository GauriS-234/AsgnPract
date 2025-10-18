package Inheritance;

class FlightTicket {
    int ticketNo;
    String passengerName;
    String seatClass;

    public FlightTicket(int ticketNo, String passengerName, String seatClass) {
        this.ticketNo = ticketNo;
        this.passengerName = passengerName;
        this.seatClass = seatClass;
    }

    public void calculateCharges(double baseFare) {
        double finalFare = baseFare;
        if (seatClass.equalsIgnoreCase("Business")) {
            finalFare += 2000;
        } else if (seatClass.equalsIgnoreCase("First")) {
            finalFare += 5000;
        }
        System.out.println("Total fare for " + passengerName + ": " + finalFare);
    }
}

class FlightTest {
    public static void main(String[] args) {
        FlightTicket ticket = new FlightTicket(201, "Ravi", "Business");
        ticket.calculateCharges(10000);
    }
}
