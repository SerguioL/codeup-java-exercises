package VehicleA;

abstract public class Vehicle {

    public int currentSpeedHph;
    public String directionHeading;
    public int currentNoOfPassengers;

    abstract public void turnOn();

    public void goFaster(int moreMph){
        currentSpeedHph += moreMph;
    }

}


