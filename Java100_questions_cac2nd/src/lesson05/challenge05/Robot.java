package lesson05.challenge05;

public class Robot {
    //フィールド
    int water;

    //メソッド
    public void setWater(int water) {
        this.water = water;
    }

    public void pumpWater() {
        System.out.println("水を" + water + "リットル出します。");
    }

}
