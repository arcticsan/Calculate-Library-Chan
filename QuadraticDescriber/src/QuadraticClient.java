/* This class contains the main method and handles interactions with the user.
 * @author Bryan Chan
 * @version 0 October 3, 2018
 */

import java.util.*;

public class QuadraticClient {
	
	public static void main (String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter coefficents of a standard quadratic equation:");
		double a = userInput.nextDouble();
		double b = userInput.nextDouble();
		double c = userInput.nextDouble();
		userInput.close();
		String continue_
		do {
			System.out.println(Quadratic.quadrDescriber(a, b, c));
		}
		while (continue != "quit");*/
	}
}
	//System.out.println(Quadratic.round2(-5.5600000000000005));