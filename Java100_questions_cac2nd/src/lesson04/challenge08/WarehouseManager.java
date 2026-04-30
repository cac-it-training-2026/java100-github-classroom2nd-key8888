/**
 * 第4章 倉庫番のお仕事
 *
 * 問題8 荷物の入れ替え（二つの配列の要素を入れ替える）
 *
 * AB興産から新たな荷物のセットを預かりました。
 * 5袋からなる荷物のセットで、それぞれ6～10の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定し、
 * それぞれの袋の値は重複しません。
 *
 * AB興産からの依頼は、以前から預かっている1～5の荷物と
 * 今回預かる6～10の荷物を再編し、奇数のみの配列と
 * 偶数のみの配列に分けるというものです。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産から新たに預かった荷物と以前から預かっている荷物の
 *  中身を確認してください。
 *
 *  Yさん：
 *  はい、
 *  以前から預かっている荷物の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  今回預かった荷物の状態は、
 *  7,9,10,6,8
 *  です。
 *
 *  E主任：
 *  その二つの荷物を奇数群、偶数群で入れ替えてください。
 *
 *  Yさん：
 *  はい、入れ替えました。
 *  奇数群の荷物の状態は、
 *  3,5,1,9,7
 *  です。
 *
 *  偶数群の荷物の状態は、
 *  10,2,8,6,4
 *  です。
 *
 */

package lesson04.challenge08;

import java.util.concurrent.ThreadLocalRandom;

public class WarehouseManager {

	public static boolean checkDuplication(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return false;
			}
		}
		return true;
	}

	public static int findTargetIndex(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void swap(int arr[], int indexA, int indexB) {
		int temp = arr[indexA];
		arr[indexA] = arr[indexB];
		arr[indexB] = temp;
	}

	public static void main(String[] args) {

		int[] ABKosanArray1 = new int[5];
		int[] ABKosanArray2 = new int[5];

		// ここに重複チェックおよび値の代入処理を記述する①(1～5)
		while (true) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
			// 重複していない場合、配列の0の値をターゲットにして、ランダムな数値を代入する
			if (checkDuplication(ABKosanArray1, randomNum)) {
				ABKosanArray1[findTargetIndex(ABKosanArray1, 0)] = randomNum;
			}
			// 配列の0の値をターゲットにして、ランダムな数値が全て代入されたかを確認する
			if (findTargetIndex(ABKosanArray1, 0) == -1) {
				break;
			}
		}

		// ここに重複チェックおよび値の代入処理を記述する②(6～10)
		while (true) {
			int randomNum = ThreadLocalRandom.current().nextInt(6, 11);
			if (checkDuplication(ABKosanArray2, randomNum)) {
				ABKosanArray2[findTargetIndex(ABKosanArray2, 0)] = randomNum;
			}
			if (findTargetIndex(ABKosanArray2, 0) == -1) {
				break;
			}
		}

		System.out.println("E主任：");
		System.out.println("AB興産から新たに預かった荷物と以前から預かっている荷物の");
		System.out.println("中身を確認してください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("以前から預かっている荷物の状態は、");
		for (int i = 0; i < ABKosanArray1.length; i++) {
			System.out.print(ABKosanArray1[i]);
			if (i != (ABKosanArray1.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("今回預かった荷物の状態は、");
		for (int i = 0; i < ABKosanArray2.length; i++) {
			System.out.print(ABKosanArray2[i]);
			if (i != (ABKosanArray2.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("E主任：");
		System.out.println("その二つの荷物を奇数群、偶数群で入れ替えてください。\n");

		// ここに奇数群(ABKosanArray1)と偶数群(ABKosanArray2)に振り分ける処理を記述する。
		int tempArr1[] = new int[5];
		int tempArr2[] = new int[5];

		for (int i = 0; i < ABKosanArray1.length; i++) {

			// ABKosanArray1：偶数を退避
			if (ABKosanArray1[i] % 2 == 0) {
				tempArr1[findTargetIndex(tempArr1, 0)] = ABKosanArray1[i];
				ABKosanArray1[i] = 0;
			}

			// ABKosanArray2：奇数を退避
			if (ABKosanArray2[i] % 2 == 1) {
				tempArr2[findTargetIndex(tempArr2, 0)] = ABKosanArray2[i];
				ABKosanArray2[i] = 0;
			}
		}

		// tempArr1の非0偶数をABKosanArray2の0の位置に代入する
		for (int i = 0; i < tempArr1.length; i++) {
			if (tempArr1[i] != 0 && findTargetIndex(ABKosanArray2, 0) != -1) {
				ABKosanArray2[findTargetIndex(ABKosanArray2, 0)] = tempArr1[i];
			}
		}
		// tempArr2の非0奇数をABKosanArray1の0の位置に代入する
		for (int i = 0; i < tempArr2.length; i++) {
			if (tempArr2[i] != 0 && findTargetIndex(ABKosanArray1, 0) != -1) {
				ABKosanArray1[findTargetIndex(ABKosanArray1, 0)] = tempArr2[i];
			}
		}

		System.out.println("Yさん：");
		System.out.println("はい、入れ替えました。");
		System.out.println("奇数群の荷物の状態は、");
		for (int i = 0; i < ABKosanArray1.length; i++) {
			System.out.print(ABKosanArray1[i]);
			if (i != (ABKosanArray1.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("偶数群の荷物の状態は、");
		System.out.println("");
		for (int i = 0; i < ABKosanArray2.length; i++) {
			System.out.print(ABKosanArray2[i]);
			if (i != (ABKosanArray2.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
