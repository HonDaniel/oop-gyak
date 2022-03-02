package main;

public class task1 {
	
	static final double PI = 3.1415926535;

	public static void main(String[] args) {
		double[] leib = leibnitz(100);
		double[] wall = wallis(100);
		pidiff(leib, wall);
	}
	
	static double[] leibnitz(int max) {
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
	
	static double[] wallis(int max) {
		double[] nums = new double[max];
		double current = 1;
		double oszto = 1, szorzo = 2;
		for (int i = 0; i < max; i++) {
			current *= szorzo / oszto;
			if (i % 2 == 0) {
				oszto += 2;
			} else {
				szorzo += 2;
			}
			nums[i] = current * 2;
		}
		return nums;
	}
	
	static void pidiff(double[] leib, double[] wal) {
		for (int i = 0; i < leib.length; i++) {
			double leibD = Math.abs(PI - leib[i]);
			double walD = Math.abs(PI - wal[i]);
			String closer =  leibD > walD ? "wallis" : "leibnitz";
			System.out.println(leibD + " - " + walD + " = " + closer);
		}
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