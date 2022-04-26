
public class Pythagorean {
	
	public static void main(String[] args) {
		
		for (int a = 1; a <= 300; a++) {
		for (int b = 1; b <= 300; b++) {
		for (int c = 1; c <= 300; c++) {
			
			if (c * c == a * a + b * b) {
				System.out.println("ピタゴラスの定理に当てはまるのは c= " + c + " a= " + a + " b= " + b );
			}
		}
		}
		}
	}
}
