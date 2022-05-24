import java.util.Scanner;

public class sample4_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		System.out.println("数字を入力してください。");
		for (int i = 100; i >= count;) {
			count += scanner.nextInt();
		}
		System.out.println("合計値 = " + count );
	}
}
