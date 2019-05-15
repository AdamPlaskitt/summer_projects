import java.util.Scanner;

public class Dublication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scanner.nextLine().toLowerCase(), result = "";
        String[] inputWordArray = input.split(" ");
        for (int i = 0; i < inputWordArray.length; i++) {
            for (int j = 0; j < inputWordArray.length; j++) {
                if (i != j) {
                    if (inputWordArray[i].equals(inputWordArray[j])) {
                        System.out.println(inputWordArray[i]);
                    }
                }
            }
        }
    }
}
