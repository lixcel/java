package North;

import java.util.Scanner;

public class sample4_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int avg = 0;
		
		System.out.println("数字を入力してください。");
		for (int i = 1; i <= 10; i++) {
			avg += scanner.nextInt();
		}	
		System.out.println("平均値 = " + (double)avg / 10);
	}
}
