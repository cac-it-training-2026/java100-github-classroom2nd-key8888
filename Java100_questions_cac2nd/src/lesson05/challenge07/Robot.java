package lesson05.challenge07;

public class Robot {
    private int water;

    public void randomWater() {
        water = (int) (Math.random() * 100) + 1;
    }

    public int getWater() {
        return water;
    }

}
