package lesson05.challenge04;

public class Robot {
    int water;

    void randomWater() {
        water = (int) (Math.random() * 9 + 1);
    }

    void pumpWater() {
        randomWater();
        System.out.println("水を" + water + "リットル出します\n");
    }
}
