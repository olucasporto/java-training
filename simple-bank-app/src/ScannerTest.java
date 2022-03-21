import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a character!");

		char character = scan.next().charAt(0);
		System.out.println("Character = " + character);

		// System.out.println("Enter a number!");

		// int number = scan.nextInt();
		// System.out.println("Number = " + number);

		// System.out.println("Enter a word!");

		// String word = scan.nextLine();
		// System.out.println("Word = " + word);

		scan.close();

	}

}