package noath;

import java.util.Scanner;

public class Sample4_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = 0;
		int b = 0;
		while (s < 3 && b < 4) {
			System.out.println("ストライク＝1 or ボール＝2");
			int num = scanner.nextInt();
			if (num == 1) {
				s++;
				num = 0;
			}else if (num == 2) {
				b++;
				num = 0;
			}else {
				System.out.println("エラー");
			}
		}
		System.out.println(b + "ボール" + s + "ストライク");
	}
}
