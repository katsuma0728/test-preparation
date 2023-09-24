package rjc;

public class Number04_02 {

	// 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の奇数のみカンマ区切りで、
	// [11]~[19]の値は偶数をカンマ区切りで表示させる

//	public static void main(String[] args) {
//		int[] number = new int[20];
//		String str = "";
//		for (int i = 0; i < number.length; i++) {
//			number[i] = i * 5;
//		}
//
//		System.out.print("奇数：");
//		for (int i = 0; i <= 10; i++) {
//			if (number[i] % 2 != 0) {
//				str += String.valueOf(number[i]) + ",";
//			}
//		}
//		System.out.println(str.substring(0, str.length() - 1));
//
//		System.out.print("偶数：");
//		str = "";
//		for (int i = 11; i <= 19; i++) {
//			if (number[i] % 2 == 0) {
//				str += String.valueOf(number[i]) + ",";
//			}
//		}
//		System.out.println(str.substring(0, str.length() - 1));
//
//	}

	public static void main(String[] args) {
		int[] number = new int[20];
		String str = "";
		for (int i = 0; i < number.length; i++) {
			number[i] = i * 5;
		}

		System.out.print("奇数:");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				// System.out.print(number[i] + ",");
				str += String.valueOf(number[i]) + ",";
			}
		}
		System.out.println(str.substring(0, str.length() - 1));

		System.out.print("偶数:");
		str = "";
		for (int i = 11; i <= 19; i++) {
			if (i % 2 == 0) {
				str += String.valueOf(number[i]) + ",";
			}
		}
		System.out.println(str.substring(0, str.length() - 1));
	}
}
