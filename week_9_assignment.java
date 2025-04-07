## Problem 1 ##

class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

## Problem 2 ##

class CarEncapsulation {
    private String make;
    private String model;
    private int year;

    public CarEncapsulation(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

## Problem 3 ##

class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayBatteryCapacity() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

## Problem 4 ##

class ElectricCarOverride extends Car {
    int batteryCapacity;

    public ElectricCarOverride(String make, String model, int year, int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

## Problem 5 ##

public class Main {
    public static void displayCarInfo(Car car) {
        car.displayDetails();
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model Y", 2022, 85);

        displayCarInfo(myCar);
        displayCarInfo(myElectricCar);
    }
}

## Problem 6 ##

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

## Problem 7 ##

interface Vehicle {
    void start();
    void stop();
}

class CarInterface implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    public static void main(String[] args) {
        CarInterface myCar = new CarInterface();
        myCar.start();
        myCar.stop();
    }
}

## Problem 8 ##

class Driver {
    String name;
    String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public void displayDriverDetails() {
        System.out.println("Driver: " + name + ", License: " + licenseNumber);
    }
}

class CarWithDriver {
    String make;
    String model;
    int year;
    Driver driver;

    public CarWithDriver(String make, String model, int year, Driver driver) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.driver = driver;
    }

    public void displayCarDetails() {
        System.out.println("Car make: " + make + ", Model: " + model + ", Year: " + year);
        driver.displayDriverDetails();
    }

    public static void main(String[] args) {
        Driver driver = new Driver("John", "AB123456");
        CarWithDriver myCar = new CarWithDriver("Honda", "Civic", 2022, driver);
        myCar.displayCarDetails();
    }
}

## Problem 9 ##

class CarWithException {
    private String make;
    private String model;
    private int year;

    public CarWithException(String make, String model, int year) {
        this.make = make;
        this.model = model;
        setYear(year);
    }

    public void setYear(int year) {
        if (year < 1886) {
            throw new IllegalArgumentException("Year cannot be less than 1886");
        }
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car make: " + make + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        try {
            CarWithException myCar = new CarWithException("Ford", "Model T", 1885);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

## Problem 10 ##

class CarWithStatic {
    private String make;
    private String model;
    private int year;
    private static int carCount = 0;

    public CarWithStatic(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        carCount++;
    }

    public static int getCarCount() {
        return carCount;
    }

    public void displayDetails() {
        System.out.println("Car make: " + make + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        new CarWithStatic("Honda", "Civic", 2020);
        new CarWithStatic("Toyota", "Corolla", 2021);

        System.out.println("Total cars created: " + CarWithStatic.getCarCount());
    }
}