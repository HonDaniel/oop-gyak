package main;

import java.util.Arrays;

public class task3 {

	public static void main(String[] args) {
		int[] tomb = new int[10];
		for(int i = 0; i < tomb.length; i++) {
			tomb[i] = (int)(Math.random() * 100);
		}
		out(tomb);
		reverse(tomb);
		System.out.println("Average of even numbers:" + posavg(tomb));
		System.out.println("Lowest number: " + findmin(tomb));
		monotonous(tomb);
		out(sort(tomb));
	}
	
	static void out(int[] tomb) {
		
		for(int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[i]);
		}
	}
	
	static void reverse(int[] tomb) {
		
		for(int i = tomb.length-1; i >= 0; i--) {
			System.out.println(tomb[i]);
		}
	}
	
	static double posavg(int[] tomb) {
		double avg = 0;
		int count = 0;
		
		for(int i = 0; i < tomb.length; i++) {
			if(tomb[i] % 2 == 0) {
				avg = tomb[i];
				count = count + 1;
			}
		}
		
		avg = avg / (double)count;
		
		return avg;
	}
	
	static int findmin(int[] tomb) {
		int min = 100;
		
		for(int i = 0; i < tomb.length; i++) {
			if (tomb[i] < min) {
				min = tomb[i];
			}
		}
		
		return min;
	}
	
	static void monotonous(int[] tomb) {
		int counter = 0;
		
		for(int i = 1; i < tomb.length; i++) {
			if(tomb[i] < tomb[i-1]) {
				counter += 1;
			}
		}
		
		if(counter>0) {
			System.out.println("Not monotonous");
		}
		else {
			System.out.println("Monotonous");
		}
	}

	static int[] sort(int[] tomb) {
		int[] sorted = new int[10];
		int min = 0;
		int temp = 0;
		sorted = tomb;
		
		for(int i = 0; i < tomb.length; i++) {
			min = i;
			for(int j = i+1; j < tomb.length; j++) {
				if(sorted[j] < sorted[min]) {
					min = j;
				}
			}
		temp = sorted[i];
		sorted[i] = sorted[min];
		sorted[min] = temp;
		}
		
		return sorted;
	}
}