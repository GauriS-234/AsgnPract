package Inheritance;

class Event {
    String eventName;
    String location;

    public Event(String eventName, String location) {
        this.eventName = eventName;
        this.location = location;
    }
}

class SportsEvent extends Event {
    String sportType;

    public SportsEvent(String eventName, String location, String sportType) {
        super(eventName, location);
        this.sportType = sportType;
    }

    public void displayEventInfo() {
        System.out.println("Event: " + eventName + ", Location: " + location + ", Sport: " + sportType);
    }
}

class EventTest {
    public static void main(String[] args) {
        SportsEvent se = new SportsEvent("Intercollege Sports", "Mumbai", "Football");
        se.displayEventInfo();
    }
}

