/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		BigDecimal sitoron, shokora, pisuta;
		BigDecimal sitoron_price, shokora_price, pisuta_price;

		sitoron = new BigDecimal("30");
		shokora = new BigDecimal("30");
		pisuta = new BigDecimal("30");

		//現在の物価上昇に合わせた値段設定
		sitoron_price = new BigDecimal("500");
		shokora_price = new BigDecimal("1000");
		pisuta_price = new BigDecimal("1000");

		//個数, 	価額の初期化
		BigDecimal totalQuantity = BigDecimal.ZERO;
		BigDecimal totalPrice = BigDecimal.ZERO;

		System.out.println(" * シトロン      \\250 ・・・ 残り%s個\n".formatted(sitoron)
				+ " * ショコラ      \\280 ・・・ 残り%s個\n".formatted(shokora)
				+ " * ピスターシュ  \\320 ・・・ 残り%s個".formatted(pisuta));

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		System.out.print("シトロン      >");
		//		int buy_sitoron = Integer.parseInt(reader.readLine());
		BigDecimal buy_sitoron = new BigDecimal(reader.readLine());

		System.out.print("ショコラ      >");
		//		int buy_shokoa = Integer.parseInt(reader.readLine());
		BigDecimal buy_shokoa = new BigDecimal(reader.readLine());

		System.out.print("ピスターシュ      >");
		//		int buy_pisuta = Integer.parseInt(reader.readLine());
		BigDecimal buy_pisuta = new BigDecimal(reader.readLine());

		totalQuantity = totalQuantity.add(buy_sitoron).add(buy_shokoa).add(buy_pisuta);
		BigDecimal sitoron_totalPrice = buy_sitoron.multiply(sitoron_price);
		BigDecimal shokoa_totalPrice = buy_shokoa.multiply(shokora_price);
		BigDecimal pisuta_toalPrice = buy_pisuta.multiply(pisuta_price);
		totalPrice = totalPrice.add(sitoron_totalPrice).add(shokoa_totalPrice).add(pisuta_toalPrice).setScale(0,
				RoundingMode.DOWN);

		System.out.println("シトロン     %s個\n".formatted(buy_sitoron)
				+ "ショコラ     %s個\n".formatted(buy_shokoa)
				+ "ピスターシュ %s個\n".formatted(buy_pisuta)
				+ "\n"
				+ "合計個数    %s個\n".formatted(totalQuantity)
				+ "合計金額  %s円"
						.formatted(totalPrice)
				+ "をお買いあげですね。\n"
				+ "承りました。\n");

		//		sitoron = sitoron - buy_sitoron;
		sitoron = sitoron.subtract(buy_sitoron).setScale(0, RoundingMode.DOWN);
		//		shokora = shokora - buy_shokoa;
		shokora = shokora.subtract(buy_shokoa).setScale(0, RoundingMode.DOWN);
		//		pisuta = pisuta - buy_pisuta;
		pisuta = pisuta.subtract(buy_pisuta).setScale(0, RoundingMode.DOWN);

		System.out.println(
				"本日のおすすめ商品です。\n"
						+ "\n"
						+ "シトロン      \\250 ・・・ 残り%s個\n".formatted(sitoron)
						+ "ショコラ      \\280 ・・・ 残り%s個\n".formatted(shokora)
						+ "ピスターシュ  \\320 ・・・ 残り%s個".formatted(pisuta));

	}

}
