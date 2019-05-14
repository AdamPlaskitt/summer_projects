import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("Welcome to FizzBuzz");
		int start = getStartValue(0);
		int end = 10;
		fizzBuzz(start, end+1);
		
	}
	
	private static void fizzBuzz(int start, int end) {
		for (int i = start; i < end; i++) {
			String output = "";
			if (i % 3 == 0) {
				output = String.join("", output, "Fizz");
			}
			if (i % 5 == 0) {
				output = String.join("", output, "Buzz");
			} 
			if (output == ""){
				output += i;
			}
			System.out.println(output);
		}
	}
	
	private static int getStartValue(int count) {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		if (count > 2) {
			System.out.println("You have had three attempts to enter a numbers, the defualt number shall now be used.");
			return result;
		}
		System.out.println("Please enter a start number, if nothing is entered 0 shall be used by defualt.");
		try {
			result = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please ensure a integer is entered");
			result = getStartValue(count + 1);
		}
		return result;
	}
}
