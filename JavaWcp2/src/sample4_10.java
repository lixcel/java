import java.util.Scanner;

public class sample4_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください。");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("*");
		}
		System.out.println("入力された数字 = " + number);
	}
}
