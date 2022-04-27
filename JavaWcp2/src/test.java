import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("三桁の数字を入力してください。");
		String str = scanner.next();
		
		if ( str.length() ==3 && str.matches("[+-]?\\d*(\\.\\d+)?") == true) {
			int S = Integer.parseInt(str);
			System.out.println(S * 2);
		}else {
			System.out.println("error");
		}

	}
}
