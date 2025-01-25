/* All Vehicles (e.g. Car, Bike, Horse, Boat, Plane) have the following behavior: they can be started, stopped and driven
for a number of kilometers
=> VehicleBehaviour (Start, Stop, Drive);

Implement a hierarchy of Car classes where:

Car is a type of Vehicle
=> Car extends Vehicle

VehicleBehaviour = interface;
// All types of vehicle have the same behaviour Start, Stop & Drive;
// All types of vehicles have a chassisNumber & availableFuel. => model(String chassisNumber, float consumptionPer100Km)

Car implements Vehicle;
properties of a Car model which cannot change: fuelTankSize, fuelType (PETROL, DIESEL, etc...), gears (max 6),
consumptionPer100Km (e.g 4.7)

properties that are configurable: availableFuel, tireSize (15, 16, 17, etc...)


properties that are instance specific: chassisNumber, consumptionPer100Km
=> Specific for each object created (each car model when created must be set a chassisNumber & consumptionPer100Km)
=> Model extends Brand


consumptionPer100Km is the consumption of the car per 100 KM with the smallest tire setting (15) in first gear


Behavior

during a start() and a stop() the car keeps track of how much it has consumed
on every start() the consumption stats are reset
a car can be driven for N kms in different gears

*/

