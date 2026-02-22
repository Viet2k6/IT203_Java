abstract class Vehicle {
    protected String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void move();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println(brand + " di chuyển bằng động cơ");
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println(brand + " di chuyển bằng sức người");
    }
}