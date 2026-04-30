/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class WarehouseManager {

	public static void main(String[] args) {

		// ここに必要な配列の宣言を記述する。
		int[] C = new int[5];
		int[] D = new int[5];
		int[] E = new int[5];

		// ここに配列に値を代入する処理を記述する。(要素はランダム)
		for (int i = 0; i < 5; i++) {
			C[i] = ThreadLocalRandom.current().nextInt(1, 11) * (ThreadLocalRandom.current().nextInt(4) == 0 ? 0 : 1);
			D[i] = ThreadLocalRandom.current().nextInt(1, 11) * (ThreadLocalRandom.current().nextInt(4) == 0 ? 0 : 1);
			E[i] = ThreadLocalRandom.current().nextInt(1, 11) * (ThreadLocalRandom.current().nextInt(4) == 0 ? 0 : 1);
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		// ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]);
			if (i < C.length - 1) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		// ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < D.length; i++) {
			System.out.print(D[i]);
			if (i < D.length - 1) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		// ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < E.length; i++) {
			System.out.print(E[i]);
			if (i < E.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nでした。直してきます...\n");

		// ここに詰め替え処理を記述する

		// 0以外の値を集めるリスト
		List<Integer> list = new ArrayList<>();

		// C・D・E から 0 以外を順番に追加
		for (int i = 0; i < 5; i++) {
			if (C[i] != 0)
				list.add(C[i]);
		}
		for (int i = 0; i < 5; i++) {
			if (D[i] != 0)
				list.add(D[i]);
		}
		for (int i = 0; i < 5; i++) {
			if (E[i] != 0)
				list.add(E[i]);
		}

		// C・D・E をいったん 0 で初期化
		for (int i = 0; i < 5; i++) {
			C[i] = 0;
			D[i] = 0;
			E[i] = 0;
		}

		// List の中身を前から詰め直す
		int idx = 0;
		for (int value : list) {
			if (idx < 5) {
				C[idx] = value;
			} else if (idx < 10) {
				D[idx - 5] = value;
			} else {
				E[idx - 10] = value;
			}
			idx++;
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		// ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]);
			if (i < C.length - 1) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		// ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < D.length; i++) {
			System.out.print(D[i]);
			if (i < D.length - 1) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		// ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < E.length; i++) {
			System.out.print(E[i]);
			if (i < E.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
