package main;

public class Task1 {

	public static void main(String[] args) {
		double[] nums = leib(100);	
		//double[] wnums = wallis(100);
		//printDifferenceFrom(PI);
		printArray(nums);
	}

	static double[] leib(int max) {
		double[] nums = new double[max];
		double current = 1;
		
		
		for (int i = 0; i < max; i++ ) {
			double addendum = 1 / (double)(3 + i * 2);
			if (i % 2 == 0) {
				addendum *=-1;
			}
			current += addendum;
			nums[i] = current * 4;
		}
		
		return nums;
	}
	
	static void printArray(double[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		// for (double num : nums) {
		//		System.out.println(num);
		//	}
		
	}
}
