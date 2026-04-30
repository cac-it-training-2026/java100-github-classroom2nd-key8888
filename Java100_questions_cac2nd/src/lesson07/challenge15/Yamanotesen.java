package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//第4章 倉庫番のお仕事

//
//問題15 山手線ゲーム

public class Yamanotesen {

	static String[] eki = {
			"東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎", "原宿", "品川", "目白", "大塚",
			"上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鴬谷", "代々木", "新大久保", "巣鴨", "高輪ゲートウェイ"
	};

	static List<String> alreadyKnows = new ArrayList<>();

	public static void start() {
		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("      ゲームスタート！    ");
	}

	public static void main(String[] args) throws IOException {
		start();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.print("駅名を入力してください：");
			String input = br.readLine();

			if (alreadyKnows.contains(input)) {
				System.out.println("その駅は既に出ました。あなたの負けです！");
				break;
			}

			boolean isValidStation = false;
			for (String station : eki) {
				if (station.equals(input)) {
					isValidStation = true;
					break;
				}
			}

			if (!isValidStation) {
				System.out.println("その駅は山手線に存在しません。あなたの負けです！");
				break;
			}

			alreadyKnows.add(input);

			int randomIndex = ThreadLocalRandom.current().nextInt(eki.length);
			String randomStation = eki[randomIndex];

			while (alreadyKnows.contains(randomStation)) {
				randomIndex = ThreadLocalRandom.current().nextInt(eki.length);
				randomStation = eki[randomIndex];
			}

			System.out.println("コンピュータの番： " + randomStation);
			alreadyKnows.add(randomStation);
		}

		br.close();
	}

}
