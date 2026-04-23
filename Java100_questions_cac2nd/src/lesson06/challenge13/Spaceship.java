package lesson06.challenge13;

public class Spaceship {
    private double fuel;

    public double getFuel() {
        return fuel;
    }
    
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    
    public boolean checkFuel(double fuelNum) {
        if (Math.floor(fuelNum) >= 12) {
            return true;
        } else {
            return false;
        }
    }

    
    
}
