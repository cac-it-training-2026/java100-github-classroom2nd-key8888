package lesson05.challenge06;

public class Robot {
    public void makeOmelet(int eggNum, int butterNum) {
        int omeletNum = Math.min(eggNum / 2, butterNum / 5);
        System.out.println("\n【※ここにオムレツの個数を出力】" + omeletNum + "人分のオムレツを作成しました。");
    }
}
