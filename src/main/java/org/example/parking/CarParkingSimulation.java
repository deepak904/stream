package org.example.parking;

import java.util.ArrayList;
import java.util.List;

class Car {
    private String licensePlate;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

class ParkingLot {
    private int capacity;
    private List<Car> parkedCars;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedCars = new ArrayList<>();
    }

    public boolean parkCar(Car car) {
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);
            System.out.println(car.getLicensePlate() + " is parked.");
            return true;
        } else {
            System.out.println("Parking lot is full. " + car.getLicensePlate() + " cannot be parked.");
            return false;
        }
    }

    public boolean removeCar(String licensePlate) {
        for (Car car : parkedCars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                parkedCars.remove(car);
                System.out.println(licensePlate + " is removed from the parking lot.");
                return true;
            }
        }
        System.out.println("Car with license plate " + licensePlate + " is not found in the parking lot.");
        return false;
    }

    public void displayCars() {
        System.out.println("Cars in the parking lot:");
        for (Car car : parkedCars) {
            System.out.println(car.getLicensePlate());
        }
    }
}

public class CarParkingSimulation {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5);

        Car car1 = new Car("ABC123");
        Car car2 = new Car("XYZ789");
        Car car3 = new Car("DEF456");

        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
        parkingLot.parkCar(car3);

        parkingLot.displayCars();

        parkingLot.removeCar("XYZ789");

        parkingLot.displayCars();
    }
}
