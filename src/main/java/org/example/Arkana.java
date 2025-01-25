package org.example;

public class Arkana extends Renault {
    public Arkana(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
    }

    @Override
    public void setConsumptionPer100Km(float consumptionPer100Km) {
        super.setConsumptionPer100Km(5.2f);
    }
}
