package org.example;

abstract class Vehicle {
    private float availableFuel;
    private String chassisNumber;

    public Vehicle(float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void drive(float km);
    public abstract void shiftGear(int gear);

    public float getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(float fuelSpent) {
        this.availableFuel -= fuelSpent;
    }
}