package rjc;

public class Number02_02 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("1～10までの偶数の個数は" + count);
		System.out.println("1～10までの偶数の合計は" + sum);
	}
}
