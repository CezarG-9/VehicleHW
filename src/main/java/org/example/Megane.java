package org.example;

public class Megane extends Renault {
    public Megane(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
    }

    @Override
    public void setConsumptionPer100Km(float consumptionPer100Km) {
        super.setConsumptionPer100Km(4.4f);
    }
}
