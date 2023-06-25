package com.amrita.jpl.cys21011.ex;

public class Vehicle {
    protected boolean isRunning;

    public void start() {
        isRunning = true;
        System.out.println("[Vehicle] started.");
    }

    public void stop() {
        isRunning = false;
        System.out.println("[Vehicle] stopped.");
    }

    static class Car extends Vehicle {
        private String carModel;
        private int carYear;
        private int numWheels;

        public Car(String model, int year, int wheels) {
            this.carModel = model;
            this.carYear = year;
            this.numWheels = wheels;
            System.out.println("Car Instantiated with Parameters: " + carModel + ", " + carYear + ", " + numWheels);
        }

        public void drive(int gearPosition) {
            if (isRunning) {
                System.out.println("Driving the car in gear position: " + gearPosition);
            } else {
                System.out.println("Error: Cannot drive. Vehicle is not running.");
            }
        }
    }

    static class Bike extends Vehicle {
        private String bikeBrand;
        private int bikeYear;
        private int numGears;

        public Bike(String brand, int year, int gears) {
            this.bikeBrand = brand;
            this.bikeYear = year;
            this.numGears = gears;
            System.out.println("Bike Instantiated with Parameters: " + bikeBrand + ", " + bikeYear + ", " + numGears);
        }

        public void pedal(int pedalSpeed) {
            if (isRunning) {
                System.out.println("Pedaling the bike at speed: " + pedalSpeed);
            } else {
                System.out.println("Error: Cannot pedal. Vehicle is not running.");
            }
        }
    }

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
