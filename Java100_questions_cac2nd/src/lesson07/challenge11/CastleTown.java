/**
 * 第7章 武士のお仕事
 *
 * 問題11 instanceof演算子
 *
 * instanceof演算子を利用する。
 *
 * 侍クラスの配列に（藩士、浪人）をランダムに入れ、
 * それぞれの人数を表示してください。
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれの人数を表示してみます。
 *
 * 藩士：3人
 *
 * 浪人：2人
 *
 */

package lesson07.challenge11;


//ここにSamuraiクラスを記述
class Samurai {
}


//ここにRetainerクラスを記述
class Retainer extends Samurai {
}

//ここにRoninクラスを記述
class Ronin extends Samurai {
}



public class CastleTown {

    public static void main(String[] args) {
        System.out.println("5人の侍を配列に詰めます。\n");


        //ここに適切な処理を記述
        Samurai[] samuraiArray = new Samurai[5];
        samuraiArray[0] = new Retainer();
        samuraiArray[1] = new Ronin();
        samuraiArray[2] = new Retainer();
        samuraiArray[3] = new Ronin();
        samuraiArray[4] = new Retainer();



        System.out.println("詰め終わりました。\n");
        System.out.println("それぞれの人数を表示してみます。\n");


        int retainerCount = 0;
        int roninCount = 0;


        //ここに適切な処理を記述
        for (Samurai samurai : samuraiArray) {
            if (samurai instanceof Retainer) {
                retainerCount++;
            } else if (samurai instanceof Ronin) {
                roninCount++;
            }
        }


        System.out.println("藩士：" + retainerCount + "人");
        System.out.println("\n浪人：" + roninCount + "人");
    }
}
