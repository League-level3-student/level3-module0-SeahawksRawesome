package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] x = { "Hi", "Hello", "What's up?", "Cool", "*screams internally*" };
		// 2. print the third element in the array
		System.out.println(x[2]);
		// 3. set the third element to a different value
		x[3] = "Oeuf";
		// 4. print the third element again
		System.out.println(x[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < x.length; i++) {
			x[i] = "WORD!";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		// 7. make an array of 50 integers
		int[] y = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < y.length; i++) {
			Random rand = new Random();
			y[i] = rand.nextInt(100);
		}
		
		// 9. without printing the entire array, print only the smallest number on the
		// array
		System.out.println("Starting sort!!");
		int holder_low = y[0];
		for (int i = 0; i < y.length; i++) {
			if(holder_low < y[i]) {
				holder_low = holder_low;
			}
			else {
				holder_low = y[i];
			}
		}
		System.out.println(holder_low);
		
		
		

		// 10 print the entire array to see if step 8 was correct
		//Did that
		// 11. print the largest number in the array.
		int holder_high = y[0];
		for (int i = 0; i < y.length; i++) {
			if(holder_high > y[i]) {
				holder_high = holder_high;
			}
			else {
				holder_high = y[i];
			}
		}
		
		System.out.println(holder_high);
		// 12. print only the last element in the array
		System.out.println(y[49]);
	}
}
