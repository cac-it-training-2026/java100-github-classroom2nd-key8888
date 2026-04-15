/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		//ここから閉店
		// 100を掛けてから割ることで、整数（％）として取得する
		BigDecimal sitoronPercentage = sitoron_totalPrice.multiply(new BigDecimal("100"))
				.divide(totalPrice, 0, RoundingMode.DOWN);

		BigDecimal shokoaPercentage = shokoa_totalPrice.multiply(new BigDecimal("100"))
				.divide(totalPrice, 0, RoundingMode.DOWN);

		BigDecimal pisutaPercentage = pisuta_toalPrice.multiply(new BigDecimal("100"))
				.divide(totalPrice, 0, RoundingMode.DOWN);

		System.out.println("閉店時間となりました。\n"
				+ "またのお越しをお待ちしております。\n"
				+ "\n"
				+ "売上の割合\n"
				+ "売上合計      \\" + totalPrice + "\n"
				+ "\n"
				+ "内訳\n"
				+ "シトロン      \\1250・・・ %s%%\n".formatted(sitoronPercentage)
				+ "ショコラ      \\420・・・ %s%%\n".formatted(shokoaPercentage)
				+ "ピスターシュ  \\800・・・ %s%%".formatted(pisutaPercentage));

		BigDecimal totalPriceAvge = totalPrice.divide(new BigDecimal("3"), 0, RoundingMode.DOWN);

		System.out.println(" * 明日の三色マカロンの配合率が決まりました！\n"
				+ " *\n"
				+ " * シトロンの味    ・・・ %s%%\n".formatted(sitoronPercentage)
				+ " * ショコラの味    ・・・ %s%%\n".formatted(shokoaPercentage)
				+ " * ピスターシュの味・・・ %s%%".formatted(pisutaPercentage)
				+ " *\n"
				+ " * が楽しめます！\n"
				+ " *\n"
				+ " * 値段は\\%sです。".formatted(totalPriceAvge));

	}

}
