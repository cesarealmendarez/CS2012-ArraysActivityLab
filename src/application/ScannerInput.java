// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package application;
import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name below:");
		String userNameInput = scanner.nextLine();
			
		System.out.println("Hello " + userNameInput + ", what is your age?");
		int userAgeInput = scanner.nextInt();	
		
		System.out.println("Your name is " + userNameInput + " and you are " + userAgeInput + "!");		
		
		scanner.close();
	}
}
