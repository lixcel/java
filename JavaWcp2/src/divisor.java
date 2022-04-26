
public class divisor {
	public static void main(String[] args) {
		int a,b;
		
		for (a = 1; a <= 100; a++) {
		for (b = 1; b <= 100; b++) {
			
			if (a % b == 0) {
				System.out.println("a= " + a + " の時、約数は" + b );
			}
		}
		}
	}
}
