package lesson08.challenge10;

public class SuperRobot {
    // 爆発するためのメソッド
    public void explode() {
        System.out.println("***");
        System.out.println("*      *");
        System.out.println("*  爆発  *");
        System.out.println("*      *");
        System.out.println("***");
    }

    // アスタリスクの炒め
    public void stirFry() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
