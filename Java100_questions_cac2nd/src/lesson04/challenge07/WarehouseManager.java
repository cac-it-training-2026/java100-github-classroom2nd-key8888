/**
 * 第4章 倉庫番のお仕事
 *
 * 問題7 荷物の並べ替え（昇順、降順）
 *
 * AB興産からの次の依頼は、昇順、降順による並べ替えです。
 * 5袋ある荷物を中の値によって、小さい順に並べ替えて表示した後、
 * 大きい順に並べ替えて表示します。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の並べ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  並べ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  小さい順に並べ替えた後の状態は、
 *  1,2,3,4,5
 *  です。
 *
 *  大きい順に並べ替えた後の状態は、
 *  5,4,3,2,1
 *  です。
 *
 */

package lesson04.challenge07;

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

		int[] ABKosanArray = new int[5];

		// ここに重複チェックおよび値の代入処理を記述する
		while (true) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
			if (checkDuplication(ABKosanArray, randomNum)) {
				for (int i = 0; i < ABKosanArray.length; i++) {
					if (ABKosanArray[i] == 0) {
						ABKosanArray[i] = randomNum;
						break;
					}
				}
			}
			boolean isFull = true;
			for (int i = 0; i < ABKosanArray.length; i++) {
				if (ABKosanArray[i] == 0) {
					isFull = false;
					break;
				}
			}
			if (isFull) {
				break;
			}
		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の並べ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("並べ替え前の状態は、");

		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		// ここに昇順にソートする処理を記述する
		for (int i = 0; i < ABKosanArray.length - 1; i++) {
			for (int j = 0; j < ABKosanArray.length - 1 - i; j++) {
				if (ABKosanArray[j] > ABKosanArray[j + 1]) {
					swap(ABKosanArray, j, j + 1);
				}
			}
		}

		System.out.println("小さい順に並べ替えた後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		// ここに降順にソートする処理を記述する
		for (int i = 0; i < ABKosanArray.length - 1; i++) {
			for (int j = 0; j < ABKosanArray.length - 1 - i; j++) {
				if (ABKosanArray[j] < ABKosanArray[j + 1]) {
					swap(ABKosanArray, j, j + 1);
				}
			}
		}

		System.out.println("大きい順に並べ替えた後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");
	}
}
