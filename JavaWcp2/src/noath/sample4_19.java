package noath;

import java.util.Scanner;

public class sample4_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int average = 0;
		
		for(;;) {
			int value = scanner.nextInt();
			if(value != 0) {
			count++;
			sum += value;
			}else {
				average = sum / count;
				break;
			}
		}
		System.out.println("平均値は" + average + "です。");
	}
}
