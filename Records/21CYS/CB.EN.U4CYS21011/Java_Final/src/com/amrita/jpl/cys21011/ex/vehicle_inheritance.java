package com.amrita.jpl.cys21011.ex;

/**
 * Vehicle class, represents a basic vehicle.
 */
class Vehicle {
    /** Indicator of whether the vehicle is currently running. */
    protected boolean run_status;

    /**
     * Starts the vehicle.
     */
    public void start() {
        run_status = true;
        System.out.println("[Vehicle] started.");
    }

    /**
     * Stops the vehicle.
     */
    public void stop() {
        run_status = false;
        System.out.println("[Vehicle] stopped.");
    }
}

/**
 * Car class, represents a car. Inherits from Vehicle.
 */
class Car extends Vehicle {
    /** Model name of the car. */
    private String modelName;

    /** Year of manufacturing. */
    private int year;

    /** Number of wheels on the car. */
    private int numOfWheels;

    /**
     * Constructs a car.
     *
     * @param modelName The model name of the car.
     * @param year The year the car was manufactured.
     * @param numOfWheels The number of wheels on the car.
     */
    public Car(String modelName, int year, int numOfWheels) {
        this.modelName = modelName;
        this.year = year;
        this.numOfWheels = numOfWheels;
        System.out.println("Car Instantiated with Parameters " + modelName + ", " + year + ", " + numOfWheels);
    }

    /**
     * Drives the car in a given gear.
     *
     * @param gearPosition The gear to drive in.
     */
    public void drive(int gearPosition) {
        if (run_status) {
            System.out.println("Driving the car in gear position: " + gearPosition);
        } else {
            System.out.println("[Error] The car is not running.");
        }
    }
}

/**
 * Bike class, represents a bicycle. Inherits from Vehicle.
 */
class Bike extends Vehicle {
    /** Brand name of the bike. */
    private String brandName;

    /** Year of manufacturing. */
    private int year;

    /** Number of gears on the bike. */
    private int numOfGears;

    /**
     * Constructs a bike.
     *
     * @param brandName The brand name of the bike.
     * @param year The year the bike was manufactured.
     * @param numOfGears The number of gears on the bike.
     */
    public Bike(String brandName, int year, int numOfGears) {
        this.brandName = brandName;
        this.year = year;
        this.numOfGears = numOfGears;
        System.out.println("Bike Instantiated with Parameters " + brandName + ", " + year + ", " + numOfGears);
    }

    /**
     * Pedals the bike at a given speed.
     *
     * @param pedalSpeed The speed to pedal at.
     */
    public void pedal(int pedalSpeed) {
        if (run_status) {
            System.out.println("Pedaling the bike at speed: " + pedalSpeed);
        } else {
            System.out.println("[Error] The bike is not running.");
        }
    }
}

/**
 * Main class to create and test vehicle objects.
 */
public class vehicle_inheritance {
    public static void main(String[] args) {
        Car car = new Car("Jaguar XF", 2022, 4);
        car.start();
        car.drive(3);
        car.stop();

        Bike bike = new Bike("Giant", 2021, 18);
        bike.start();
        bike.pedal(10);
        bike.stop();
    }
}
