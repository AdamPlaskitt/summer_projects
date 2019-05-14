import java.io.IOException;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("Welcome to FizzBuzz");
		int start = getStartValue();
		int end = 100;
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
	
	private static int getStartValue() {
		return 0;
	}
}
