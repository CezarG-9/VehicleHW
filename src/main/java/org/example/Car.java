package org.example;

abstract class Car extends Vehicle {
    private float fuelTankSize;
    private String fuelType;
    private int maxGears;
    private float consumptionPer100Km;
    private float currentFuelConsumption;
    private int currentGear;
    private int tireSize;

    public Car(float availableFuel, String chassisNumber, int tireSize, float consumptionPer100Km, int maxGears, String fuelType, float fuelTankSize) {
        super(availableFuel, chassisNumber);
        this.tireSize = tireSize;
        this.currentGear = 0;
        this.currentFuelConsumption = 0;
        this.consumptionPer100Km = consumptionPer100Km;
        this.maxGears = maxGears;
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelTankSize=" + fuelTankSize +
                ", fuelType='" + fuelType + '\'' +
                ", maxGears=" + maxGears +
                ", consumptionPer100Km=" + consumptionPer100Km +
                ", currentFuelConsumption=" + currentFuelConsumption +
                ", currentGear=" + currentGear +
                ", tireSize=" + tireSize +
                "} " + super.toString();
    }

    @Override
    public void start() {
        currentFuelConsumption = 0;
    }

    @Override
    public void stop() {
        System.out.println("Total fuel consumed: " + currentFuelConsumption + " liters");
    }

    @Override
    public void drive(float km) {
        float consumptionForThisDrive = (consumptionPer100Km / 100) * km;
        currentFuelConsumption += consumptionForThisDrive;
    }

    @Override
    public void shiftGear(int gear) {
        if (gear < 1 || gear > maxGears) {
            System.out.println("Invalid gear");
        } else {
            currentGear = gear;
        }
    }

    public float getAverageFuelConsumption() {
        return currentFuelConsumption;
    }

    public float getFuelTankSize() {
        return fuelTankSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getMaxGears() {
        return maxGears;
    }

    public float getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public float getCurrentFuelConsumption() {
        return currentFuelConsumption;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setConsumptionPer100Km(float consumptionPer100Km) {
        this.consumptionPer100Km = consumptionPer100Km;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }
}
