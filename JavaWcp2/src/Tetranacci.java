
public class Tetranacci {
	public static void main(String[] args) {
		int f0,f1,f2,f3,fn;
		
		f0 = 0;
		System.out.println(f0);
		
		f1 = 0;
		System.out.println(f1);
		
		f2 = 0;
		System.out.println(f2);
		
		f3 = 1;
		System.out.println(f3);
		
		for (int i = 4; i <= 10; ++i) {
			fn = f0 + f1 + f2 + f3;
			System.out.println(fn);
			f0 = f1;
			f1 = f2;
			f2 = f3;
			f3 = fn;
		}
	}
}
