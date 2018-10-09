/* This class contains the main method and handles interactions with the user.
 * @author Bryan Chan
 * @version 0 October 3, 2018
 */

import java.util.*;

public class QuadraticClient {
	
	public static void main (String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c\n");
		boolean stop_run;
		do {
			Scanner userInput = new Scanner(System.in);
			System.out.print("a: ");
			double a = userInput.nextDouble();
			System.out.print("b: ");
			double b = userInput.nextDouble();
			System.out.print("c: ");
			double c = userInput.nextDouble();
			System.out.println("");
			Quadratic.quadrDescriber(a, b, c);
			//System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.println("\nDo you want to keep going? (Type \"quit\" to end)");
			String quit = userInput.next().toLowerCase();
			stop_run = quit.contentEquals("quit");
			System.out.println("");
		}
		while (stop_run != true);
		}
}