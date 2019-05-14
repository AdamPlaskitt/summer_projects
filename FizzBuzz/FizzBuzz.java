import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		System.out.println("Welcome to FizzBuzz");
		int start = getNumber(0, "Please enter the START number", 0);
		int end = getNumber(0, "Please enter the END number", 100);
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
	
	private static int getNumber(int count, String message, int defualt) {
		Scanner scanner = new Scanner(System.in);
		int result = defualt;
		if (count > 2) {
			System.out.println("You have had three attempts to enter a number, the defualt number shall now be used.");
		} else {
			System.out.println(String.join(", ", message, String.join(" ", "if nothing is entered", Integer.toString(defualt), "shall be used by defualt.")));
			try {
				result = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please ensure a integer is entered");
				result = getNumber(count + 1, message, defualt);
			}
		}
		scanner.close();
		return result;
	}
}
