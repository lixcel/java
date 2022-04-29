
public class divisor {
	public static void main(String[] args) {
		int a = 1234567890;
		int sum = 0;
		int b,c;
		
		
		for (b = 1; b <= 30000000; b++) {
			c = a % b;
			if (c == 0) {
				System.out.println( b );
				sum = sum + b;
				System.out.println(sum);
			}
		}
	}
}
