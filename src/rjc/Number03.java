package rjc;

public class Number03 {
	
	//1〜10までの整数をカンマ区切りで横並びで表示させる
	//(10にはカンマをつけない)
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < number.length; i++) {
			if (i < number.length - 1) {
				System.out.print(number[i] + ",");
			} else {
				System.out.print(number[i]);
			}
		}
	}
}
