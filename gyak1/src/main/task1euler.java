package main;

public class task1euler {

	public static void main(String[] args) {
		int n = 11;
		double e = euler(n);
		System.out.println(e);
	}
	
	static double euler(int n) {
		double e = 0;
		
		for(int i = 0; i< n; i++) {
			e += 1 / (double)factor(i); 
		}
		
		return e;
		
	}
	
	static int factor(int n) {
		int f = 1;
		for(int i = 1; i < n; i++) {
			f *= i;
		}
		
		return f;
	}
	
}
