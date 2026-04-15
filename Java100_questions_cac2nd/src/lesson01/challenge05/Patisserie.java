/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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
				+ "承りました。");

	}

}
