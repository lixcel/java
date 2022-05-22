import java.util.Scanner;

public class sample4_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max_value = 0;
		
		System.out.println("数字を１０回入力してください。");
		
		for (int i = 1; i <= 10; i++) {
			int value = scanner.nextInt();
			if (value > max_value) {
				max_value = value;
			}
		}
		System.out.println("最大値は " + max_value + "です。");
	}
}
