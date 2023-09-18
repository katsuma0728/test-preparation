package rjc;

public class Number04 {
	public static void main(String[] args) {
		int[] number = new int[20];

		// 配列に0から5ずつ加算して代入
		for (int i = 0; i < number.length; i++) {
			number[i] = i * 5;
		}

		// 奇数の表示
		System.out.print("奇数：");
		// 最初の要素かを判断
		// trueで初期化
		boolean isFirstOdd = true;

		// [0]から[10]の奇数をカンマ区切りで表示
		for (int i = 0; i <= 10; i++) {
			if (number[i] % 2 != 0) {
				// 条件の反転
				if (!isFirstOdd) {
					System.out.print(", ");
				}
				System.out.print(number[i]);
				isFirstOdd = false;

			}
		}
		System.out.println();

		// 偶数の表示
		System.out.print("偶数：");
		// 最初の要素かを判断
		// trueで初期化
		boolean isFirstEven = true;

		// [11]から[19]の偶数をカンマ区切りで表示
		for (int i = 11; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				// 条件の反転
				if (!isFirstEven) {
					System.out.print(", ");
				}
				System.out.print(number[i]);
				isFirstEven = false;

			}
		}
		System.out.println();
	}
}
