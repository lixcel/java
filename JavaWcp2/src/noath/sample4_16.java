package noath;

import java.util.Scanner;

public class sample4_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("２以上の数値を入力してください。");
		int value = scanner.nextInt();
		
		for (int i = 2; value > 1; i++) {
			while ((value % i) == 0) {
				System.out.print(i + " ");
				value /= i;
			}
		}
	}
}
