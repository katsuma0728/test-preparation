package rjc;

public class Number02 {
	
	//1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("1～10までの偶数の合計は" + sum);
		System.out.println("1～10までの偶数の個数は" + count);
	}
}
