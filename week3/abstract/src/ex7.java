abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println(brand + " car engine started with a key ignition.");
    }

    void stopEngine() {
        System.out.println(brand + " car engine stopped smoothly.");
    }
}
class Motorcycle extends Vehicle {

    Motorcycle(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println(brand + " motorcycle engine started with a button press.");
    }

    void stopEngine() {
        System.out.println(brand + " motorcycle engine stopped after a short idle.");
    }
}

public class ex7 {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Yamaha");

        car.startEngine();
        car.stopEngine();

        System.out.println("---------------------");

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
