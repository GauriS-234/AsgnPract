package Inheritance;
class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area (" + color + "): " + area);
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("Red", 10, 5);
        rect.calculateArea();
    }
}

