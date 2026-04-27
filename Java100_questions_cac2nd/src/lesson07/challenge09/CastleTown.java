/**
 * 第7章 武士のお仕事
 *
 * 問題9  getClass()メソッドの利用
 *
 * 侍クラスのサブクラスをまとめて扱う。
 *
 * 要素数5の侍クラスの配列を用意し、
 * 藩士クラス、浪人クラスの何れかをランダムで代入します。
 * getClass()メソッドを使いそれぞれの要素に何のクラスの
 * オブジェクトが入ったか表示してください。
 * （藩士クラス、浪人クラスともに
 *   デフォルトコンストラクタを用意します）
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれ表示してみます。
 *
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 *
 */

package lesson07.challenge09;

class Samurai {

    protected String name;

    void fight() {
        System.out.println("戦うよ～。");
    }

    void work() {
        System.out.println("何かして働くよ～");
    }

}


//ここにRetainerクラスを記述
class Retainer extends Samurai {

    Retainer() {
        this.name = "藩士";
    }

    @Override
    void work() {
        System.out.println("藩のために働くよ～");
    }
}


//ここにRoninクラスを記述
class Ronin extends Samurai {

    Ronin() {
        this.name = "浪人";
    }

    @Override
    void work() {
        System.out.println("自由に働くよ～");
    }
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
        System.out.println("それぞれ表示してみます。\n");


        //ここに適切な処理を記述
        for (Samurai samurai : samuraiArray) {
            System.out.println(samurai.getClass());
        }

    }
}
