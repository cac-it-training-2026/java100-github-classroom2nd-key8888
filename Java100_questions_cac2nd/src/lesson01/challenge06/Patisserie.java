/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int sitoron, shokora, pisuta;
		int sitoron_price, shokora_price, pisuta_price;

		sitoron = 30;
		shokora = 30;
		pisuta = 30;

		//現在の物価上昇に合わせた値段設定
		sitoron_price = 588;
		shokora_price = 1300;
		pisuta_price = 2600;

		System.out.println(" * シトロン      \\250 ・・・ 残り%d個\n".formatted(sitoron)
				+ " * ショコラ      \\280 ・・・ 残り%d個\n".formatted(shokora)
				+ " * ピスターシュ  \\320 ・・・ 残り%d個".formatted(pisuta));

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		System.out.print("シトロン      >");
		int buy_sitoron = Integer.parseInt(reader.readLine());
		System.out.print("ショコラ      >");
		int buy_shokoa = Integer.parseInt(reader.readLine());
		System.out.print("ピスターシュ      >");
		int buy_pisuta = Integer.parseInt(reader.readLine());

		System.out.println("シトロン     %d個\n".formatted(buy_sitoron)
				+ "ショコラ     %d個\n".formatted(buy_shokoa)
				+ "ピスターシュ %d個\n".formatted(buy_pisuta)
				+ "\n"
				+ "合計個数    %d個\n".formatted(buy_pisuta + buy_shokoa + buy_sitoron)
				+ "合計金額  %d円"
						.formatted(buy_pisuta * pisuta_price + buy_shokoa * shokora_price + buy_sitoron * sitoron_price)
				+ "をお買いあげですね。\n"
				+ "承りました。\n");

		sitoron = sitoron - buy_sitoron;
		shokora = shokora - buy_shokoa;
		pisuta = pisuta - buy_pisuta;

		System.out.println(
				"本日のおすすめ商品です。\n"
						+ "\n"
						+ "シトロン      \\250 ・・・ 残り%d個\n".formatted(sitoron)
						+ "ショコラ      \\280 ・・・ 残り%d個\n".formatted(shokora)
						+ "ピスターシュ  \\320 ・・・ 残り%d個".formatted(pisuta));

	}

}
