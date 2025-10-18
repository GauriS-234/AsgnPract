package Inheritance;

class Transport {
    String mode;
    int maxSpeed;

    public Transport(String mode, int maxSpeed) {
        this.mode = mode;
        this.maxSpeed = maxSpeed;
    }
}

class Bus extends Transport {
    int routeNo;
    int seatCount;

    public Bus(String mode, int maxSpeed, int routeNo, int seatCount) {
        super(mode, maxSpeed);
        this.routeNo = routeNo;
        this.seatCount = seatCount;
    }

    public void showRouteDetails() {
        System.out.println("Bus Route: " + routeNo + ", Seats: " + seatCount + ", Mode: " + mode + ", Max Speed: " + maxSpeed);
    }
}

class TransportTest {
    public static void main(String[] args) {
        Bus bus = new Bus("Road", 80, 101, 40);
        bus.showRouteDetails();
    }
}

