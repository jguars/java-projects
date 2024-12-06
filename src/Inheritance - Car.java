// Inheritance

class Vehicle {
    String make;
    String model;
    String color;
    int speed;

    // Parameterized constructor
    public Vehicle(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
        System.out.println("Vehicle created.");
    }

    public void accelerate () {
        System.out.println("The vehicle is speeding up.");
        this.speed += 5;
    }

    public void brake() {
        System.out.println("The vehicle is slowing down.");
        this.speed -= 5;
    }

    public void turn(String direction) {
        System.out.println("Turning " + direction);
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle{
    int seatPosition;

    // Parameterized constructor
    public Car(String make, String model, String color) {
        super(make, model, color);
        this.seatPosition = 0;
        System.out.println("Car created.");
    }

    public void adjustSeat(int adjustment) {
        this.seatPosition += adjustment;

        if(adjustment > 0) {
            System.out.println("Moving seat forward...");
        }
        else if(adjustment < 0) {
            System.out.println("Moving seat backward...");
        }
        else {
            System.out.println("Seat position not changed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Create a Car object using the parameterized constructor
        Car tesla = new Car("Tesla", "Model S", "Red");

        // Use inherited methods
        tesla.accelerate();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.brake();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.adjustSeat(2);

    }
}
