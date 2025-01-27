package org.example;

public class Arkana extends Renault {
    public Arkana(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        setConsumptionPer100Km(5.2f);
        System.out.println("Renault Arakana with chassis number: " + chassisNumber + " has been created.");
    }

    @Override
    public void setConsumptionPer100Km(float consumptionPer100Km) {
        super.setConsumptionPer100Km(consumptionPer100Km);
    }
}
