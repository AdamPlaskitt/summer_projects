import java.util.Scanner;

public class Capitalization {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string:");
		String input = scanner.nextLine().toLowerCase(), result = "";
		String[] inputWordArray = input.split(" ");
		char[] charArray;
		for (int i = 0; i < inputWordArray.length; i++) {
			charArray = inputWordArray[i].toCharArray();
			String temp;
			charArray = inputWordArray[i].toCharArray();
			temp = Character.toString(charArray[0]);
			temp = temp.toUpperCase();
			charArray[0] = temp.charAt(0);
			if (result == "") {
				result = String.join("", result, String.valueOf(charArray));
			} else {
				result = String.join(" ", result, String.valueOf(charArray));
			}
		}
		System.out.println(result);
		scanner.close();
	}
}
