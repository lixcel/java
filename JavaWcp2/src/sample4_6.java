import java.util.Scanner;

public class sample4_6 {
	public static void main(String[] args) {
		int w = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("0 か 1 を入力してください。");
		for (int i = 0; i < 10; i++) {
			if (scanner.nextInt() == 1) {
				w += 1;
			}
		}
		System.out.println("勝利数 " + w + "敗北数 " + (10 - w));
	}
}
