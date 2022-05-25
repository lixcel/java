
public class Odd {
	public static void main(String[] args) {
		
		int value = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				value += i;
			}
		}
		System.out.println(value);
	}
}
