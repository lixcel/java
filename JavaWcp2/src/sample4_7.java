import java.util.Scanner;

public class sample4_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = 0;
		int k = 0;
		
		for (int i = 1; i <= 9; i++) {
				System.out.println(i + "回表、" + "巨人の得点は？");
				k += scanner.nextInt();
				System.out.println(i + "回裏、" + "阪神の得点は？");
				h += scanner.nextInt();
		}
		System.out.println("巨人： " + k + "点、　阪神： " + h + "点");
		if (k > h) {
			System.out.println("巨人の勝ち");
		}else if (h > k) {
			System.out.println("阪神の勝ち");
		}else {
			System.out.println("引き分け");
		}
	}
}
