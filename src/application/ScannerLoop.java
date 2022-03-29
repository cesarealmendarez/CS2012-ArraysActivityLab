// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package application;
import java.util.Scanner;

public class ScannerLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int userAgeInput;
	    
	    System.out.println("Enter your age below as an integer:");
	    
	    while(true) {
	        try {
	        	userAgeInput = Integer.parseInt(scanner.nextLine());
	
	        	System.out.println("Thank you for your cooperation you " + userAgeInput + " year old!");
	        	
	        	scanner.close();
	        	
	            break;
	        }catch (NumberFormatException e) {
	            System.out.println("You did not enter an integer, try again:");
	            
	            continue;
	        }
	    }
	}
}