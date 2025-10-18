package Inheritance;

class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showVehicleDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

class Car extends Vehicle {
    double price;
    String fuelType;

    public Car(String brand, String model, double price, String fuelType) {
        super(brand, model);
        this.price = price;
        this.fuelType = fuelType;
    }

    public void showCarDetails() {
        showVehicleDetails();
        System.out.println("Price: " + price + ", Fuel Type: " + fuelType);
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 20000, "Petrol");
        car.showCarDetails();
    }
}

