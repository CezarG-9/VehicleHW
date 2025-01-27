package org.example;

public class Yaris extends Toyota {
    public Yaris(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        setConsumptionPer100Km(4.8f);
        System.out.println("Toyota Yaris with chassis number: " + chassisNumber + " has been created.");
    }

    @Override
    public void setConsumptionPer100Km(float consumptionPer100Km) {
        super.setConsumptionPer100Km(consumptionPer100Km);
    }
}
