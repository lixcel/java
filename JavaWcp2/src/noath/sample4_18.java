package noath;

import java.util.Scanner;

public class sample4_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for(;;) {
			int value = scanner.nextInt();
			if(value != 0) {
			sum += value;
			}else {
				break;
			}
		}
		System.out.println("合計値は" + sum + "です。");
	}
}
