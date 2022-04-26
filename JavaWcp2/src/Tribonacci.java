
public class Tribonacci {
	public static void main(String[] args) {
		int f0,f1,f2,fn;
		
		f0 = 0;
		System.out.println(f0);
		
		f1 = 0;
		System.out.println(f1);
		
		f2 = 1;
		System.out.println(f2);
		
		for (int i = 3; i <= 10; ++i) {
			fn = f0 + f1 + f2;
			System.out.println(fn);
			f0 = f1;
			f1 = f2;
			f2 = fn;
		}
	}
}
