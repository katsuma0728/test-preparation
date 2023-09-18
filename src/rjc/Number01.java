package rjc;

public class Number01 {
	
	//1〜10までの数字のうち偶数のみを昇順で表示させる
	public static void main(String[] args) {
		for (int number = 1; number <= 10; number++) {
			if (number % 2 == 0) {
				// System.out.println(number);
				System.out.print(number + " ");
			}
		}
		System.out.println();
	}
}
