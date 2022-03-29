// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package application;
import java.util.Scanner;

public class FloatMethods {	
	static float floatScanner() {
		System.out.println("Please enter a float below:");
		
		Scanner scanner = new Scanner(System.in);
		float userFloatInput;
		
	    while(true) {
	        try {
	        	userFloatInput = Float.parseFloat(scanner.nextLine());
	        	scanner.close();
	        	
	        	return userFloatInput;
	        }catch (NumberFormatException e) {
	            System.out.println("You did not enter a float, try again:");
	            
	            continue;
	        }
	    }		
	}
	
	static float squareFloat(float inputFloat) {
		float squaredFloat = (float) Math.pow(inputFloat, 2);
		return squaredFloat;
	}
	
	public static void main(String[] args) {
		float userFloatInput = floatScanner();
		float squaredUserFloatInput =  squareFloat(userFloatInput);
		
		System.out.println("This is your float: " + userFloatInput);
		System.out.println("And here it is squared: " + squaredUserFloatInput);
	}

}