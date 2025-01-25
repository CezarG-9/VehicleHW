package org.example;

public class Main {
    public static void main(String[] args) {
        Car car= new Arkana(40.0f, "r2210-4445Ark664");
        car.start();
        car.setTireSize(15);
        car.shiftGear(1);
        car.drive(0.02f);
        car.shiftGear(2);
        car.drive(0.02f);
        car.shiftGear(3);
        car.drive(0.4f);
        car.shiftGear(4);
        car.drive(0.54f);
        car.shiftGear(5);
        car.drive(18);
        car.shiftGear(6);
        car.drive(189.4f);
        car.shiftGear(5);
        car.drive(0.5f);
        car.shiftGear(4);
        car.drive(0.2f);
        car.shiftGear(3);
        car.drive(0.1f);
        car.shiftGear(2);
        car.drive(0.1f);
        car.stop();

        System.out.println(car);
        System.out.println("Consumption per 100Km: " + car.getConsumptionPer100Km());
        System.out.println("Avg. fuel consumption: " + car.getAverageFuelConsumption());
        System.out.println("Avaialable fuel: " + car.getAvailableFuel());
        System.out.println("Consumtpion for this drive: " + car.getCurrentFuelConsumption());


        Car secondCar = new Megane(40.0f, "r2210-3512Meg512");
        secondCar.start();
        secondCar.setTireSize(15);
        secondCar.shiftGear(1);
        secondCar.drive(0.02f);
        secondCar.shiftGear(2);
        secondCar.drive(0.02f);
        secondCar.shiftGear(3);
        secondCar.drive(0.4f);
        secondCar.shiftGear(4);
        secondCar.drive(0.54f);
        secondCar.shiftGear(5);
        secondCar.drive(18);
        secondCar.shiftGear(6);
        secondCar.drive(189.4f);
        secondCar.shiftGear(5);
        secondCar.drive(0.5f);
        secondCar.shiftGear(4);
        secondCar.drive(0.2f);
        secondCar.shiftGear(3);
        secondCar.drive(0.1f);
        secondCar.shiftGear(2);
        secondCar.drive(0.1f);
        secondCar.stop();

        System.out.println(secondCar);
        System.out.println("Consumption per 100Km: " + secondCar.getConsumptionPer100Km());
        System.out.println("Avg. fuel consumption: " + secondCar.getAverageFuelConsumption());
        System.out.println("Avaialable fuel: " + secondCar.getAvailableFuel());
        System.out.println("Consumtpion for this drive: " + secondCar.getCurrentFuelConsumption());


        Car thirdCar = new Corolla(40.0f, "T3323-1123Cor511");
        thirdCar.start();
        thirdCar.setTireSize(15);
        thirdCar.shiftGear(1);
        thirdCar.drive(0.02f);
        thirdCar.shiftGear(2);
        thirdCar.drive(0.02f);
        thirdCar.shiftGear(3);
        thirdCar.drive(0.4f);
        thirdCar.shiftGear(4);
        thirdCar.drive(0.54f);
        thirdCar.shiftGear(5);
        thirdCar.drive(18);
        thirdCar.shiftGear(6);
        thirdCar.drive(189.4f);
        thirdCar.shiftGear(5);
        thirdCar.drive(0.5f);
        thirdCar.shiftGear(4);
        thirdCar.drive(0.2f);
        thirdCar.shiftGear(3);
        thirdCar.drive(0.1f);
        thirdCar.shiftGear(2);
        thirdCar.drive(0.1f);
        thirdCar.stop();

        System.out.println(thirdCar);
        System.out.println("Consumption per 100Km: " + thirdCar.getConsumptionPer100Km());
        System.out.println("Avg. fuel consumption: " + thirdCar.getAverageFuelConsumption());
        System.out.println("Avaialable fuel: " + thirdCar.getAvailableFuel());
        System.out.println("Consumtpion for this drive: " + thirdCar.getCurrentFuelConsumption());

        Car fourthCar = new Yaris(40.0f, "t3324-6561Yar355");
        fourthCar.start();
        fourthCar.setTireSize(15);
        fourthCar.shiftGear(1);
        fourthCar.drive(0.02f);
        fourthCar.shiftGear(2);
        fourthCar.drive(0.02f);
        fourthCar.shiftGear(3);
        fourthCar.drive(0.4f);
        fourthCar.shiftGear(4);
        fourthCar.drive(0.54f);
        fourthCar.shiftGear(5);
        fourthCar.drive(18);
        fourthCar.shiftGear(6);
        fourthCar.drive(189.4f);
        fourthCar.shiftGear(5);
        fourthCar.drive(0.5f);
        fourthCar.shiftGear(4);
        fourthCar.drive(0.2f);
        fourthCar.shiftGear(3);
        fourthCar.drive(0.1f);
        fourthCar.shiftGear(2);
        fourthCar.drive(0.1f);
        fourthCar.stop();

        System.out.println(fourthCar);
        System.out.println("Consumption per 100Km: " + fourthCar.getConsumptionPer100Km());
        System.out.println("Avg. fuel consumption: " + fourthCar.getAverageFuelConsumption());
        System.out.println("Avaialable fuel: " + fourthCar.getAvailableFuel());
        System.out.println("Consumtpion for this drive: " + fourthCar.getCurrentFuelConsumption());
    }
}

/* 1. Consumption per 100Km not working as intended;
*  2. Because consumption not working as intended, tireSize & gear doesn't have any effect over fuel consumption;
*  3. Available fuel after the drive hasn't been updated to the new amount of fuel left (still shows the fuel tank size);
*  4. All cars have identical output, even if initial settings are different.
*
* */