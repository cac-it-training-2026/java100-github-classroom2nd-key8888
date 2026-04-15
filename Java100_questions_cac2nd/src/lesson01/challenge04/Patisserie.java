/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int sitoron, shokora, pisuta;

		sitoron = 30;
		shokora = 30;
		pisuta = 30;

		System.out.println(" * シトロン      \\250 ・・・ 残り%d個\n".formatted(sitoron)
				+ " * ショコラ      \\280 ・・・ 残り%d個\n".formatted(shokora)
				+ " * ピスターシュ  \\320 ・・・ 残り%d個".formatted(pisuta));

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		System.out.print("シトロン      >");
		String buy_sitoron = reader.readLine();
		System.out.print("ショコラ      >");
		String buy_shokoa = reader.readLine();
		System.out.print("ピスターシュ      >");
		String buy_pisuta = reader.readLine();

		System.out.println("シトロン     %s個\n".formatted(buy_sitoron)
				+ "ショコラ     %s個\n".formatted(buy_shokoa)
				+ "ピスターシュ %s個\n".formatted(buy_pisuta)
				+ "\n"
				+ "をお買いあげですね。\n"
				+ "承りました。");

	}

}