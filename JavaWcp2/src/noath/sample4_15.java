package noath;

import java.util.Scanner;

public class sample4_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int value = scanner.nextInt();
		int n;
		
		for (n = 2; n <= (value / 2); n++) {
			if((value % n) == 0)
				break;
		}
		if (n > (value / 2)) {
			System.out.println(value + "は素数です。");
		}else {
			System.out.println(value + "は素数ではありません。");
		}
	}
}
