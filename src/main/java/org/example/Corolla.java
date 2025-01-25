package org.example;

public class Corolla extends Toyota {
    public Corolla(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
    }

    @Override
    public void setConsumptionPer100Km(float consumptionPer100Km) {
        super.setConsumptionPer100Km(7.7f);
    }
}
