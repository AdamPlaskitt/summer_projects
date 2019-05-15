public class FizzBuzz {

	public static void main(String[] args) {
		int start = 0;
		int end = 100;
		int fizz = 3;
		int buzz = 5;
		fizzBuzz(start, end+1, fizz, buzz);
		
	}
	
	private static void fizzBuzz(int start, int end, int fizz, int buzz) {
		for (int i = start; i < end; i++) {
			String output = "";
			if (i % fizz == 0) {
				output = String.join("", output, "Fizz");
			}
			if (i % buzz == 0) {
				output = String.join("", output, "Buzz");
			} 
			if (output == ""){
				output += i;
			}
			System.out.println(output);
		}
	}
}
