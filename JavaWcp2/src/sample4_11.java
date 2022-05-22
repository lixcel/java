import java.util.Scanner;

public class sample4_11 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("数字を入力してください。");
	int count = scanner.nextInt();
	
	for (int i = 0, out = 0; i < count; i++) {
		System.out.println(out++);
		
		if (out > 9) {
			out = 0;
		}
	}
	}
}
