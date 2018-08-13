package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String [] args) {
		String[] test = {"hi", "hello", "the world is flat", "Skrrt", "oeuf"};
		print(test);
		reverse(test);
		skip(test);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	public static void print (String [] stringprint) {
		System.out.println("number 1");
		for(int i = 0; i < stringprint.length; i++) {
			System.out.println(stringprint [i]);
		}
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reverse (String [] stringprint) {
		System.out.println("number 2");
		for(int i = stringprint.length -1; i > -1 ; i--) {
			System.out.println(stringprint [i]); 
			
		}
	}
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void skip (String [] stringprint) {
		System.out.println("number 3");
		for( int i = 0; i < stringprint.length; i++) {
			if(i%2 == 0) {
				System.out.println(stringprint [i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void random (String [] stringprint) {
		
	}
	
}
