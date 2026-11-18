class Vehicle {
    String brand;

    // Parent class constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Parent class method
    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    String brand;

    // Child class constructor
    Car(String parentBrand, String childBrand) {
        super(parentBrand);
        this.brand = childBrand;
    }

    // Overridden method
    @Override
    void display() {
        super.display();

        System.out.println("Car Brand: " + brand);
        System.out.println("Parent Brand: " + super.brand);
    }
}

class MainVehicle {
    public static void main(String[] args) {

        Car c = new Car("Toyota", "BMW");

        c.display();
    }
}
