/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;


//ここにICelebrityインターフェースを記述
interface ICelebrity {
    void learn();
}


//ここにSamuraiクラスを記述
class Samurai implements ICelebrity {
    @Override
    public void learn() {
        System.out.println("戦いを嗜むよ～。");
    }

}


//ここにRetainerクラスを記述
class Retainer implements ICelebrity {
    @Override
    public void learn() {
        System.out.println("茶道を嗜むよ～。");
    }
}

//ここにRoninクラスを記述
class Ronin implements ICelebrity {
    @Override
    public void learn() {
        System.out.println("塾を開くよ～。");
    }
}


public class CastleTown {

    public static void main(String[] args) {
        System.out.println("藩士1：");


        //ここに適切な処理を記述
        ICelebrity retainer = new Retainer();
        retainer.learn();


        System.out.println("\n浪人1：");


        //ここに適切な処理を記述
        ICelebrity ronin = new Ronin();
        ronin.learn();


    }
}
