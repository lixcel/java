import java.util.Scanner;

public class sample4_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		int max_value = 0;
		int min_value = 0;
		
		System.out.println("数字を１０回入力してください。");
		
		for (int i = 1; i <= 10; i++) {
			value = scanner.nextInt();
			if (i == 1) {
				min_value = value;
			}
			if (value > max_value) {
				max_value = value;
			}else if (value < min_value){
				min_value = value;
			}
		}
		System.out.println("最大値は" + max_value);
		System.out.println("最小値は" + min_value);
	}
}
