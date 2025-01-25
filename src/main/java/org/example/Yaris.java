package org.example;

public class Yaris extends Toyota {
    public Yaris(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
    }

    @Override
    public void setConsumptionPer100Km(float consumptionPer100Km) {
        super.setConsumptionPer100Km(4.8f);
    }
}
