package lesson06.challenge14;

public class Spaceship {
    private double fuel;

    public double getFuel() {
        return fuel;
    }
    
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public boolean compareFuel(double fuelNum, double lightYear) {
        return fuelNum > lightYear;
    }

}
