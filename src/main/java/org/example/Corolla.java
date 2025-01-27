package org.example;

public class Corolla extends Toyota {
    public Corolla(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        setConsumptionPer100Km(7.7f);
        System.out.println("Toyota Corolla with chassis number: " + chassisNumber + " has been created.");
    }

    @Override
    public void setConsumptionPer100Km(float consumptionPer100Km) {
        super.setConsumptionPer100Km(consumptionPer100Km);
    }
}
