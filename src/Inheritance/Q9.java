package Inheritance;

class Artist {
    String name;
    int age;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Musician extends Artist {
    String instrument;

    public Musician(String name, int age, String instrument) {
        super(name, age);
        this.instrument = instrument;
    }

    public void perform() {
        System.out.println(name + " is performing on " + instrument);
    }
}

class ArtistTest {
    public static void main(String[] args) {
        Musician m = new Musician("Rahul", 25, "Guitar");
        m.perform();
    }
}
