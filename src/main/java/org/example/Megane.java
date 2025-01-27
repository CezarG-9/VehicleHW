package org.example;

public class Megane extends Renault {
    public Megane(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        setConsumptionPer100Km(4.4f);
        System.out.println("Renault Megane with chassis number: " + chassisNumber + " has been created.");
    }

    @Override
    public void setConsumptionPer100Km(float consumptionPer100Km) {
        super.setConsumptionPer100Km(consumptionPer100Km);
    }
}
