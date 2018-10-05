/* This class contains the methods for QuadraticClient to do various quadratic related tasks.
 * @author Bryan Chan
 * @version 0 October 3, 2018
 */
public class Quadratic {
	//returns square of integer
		public static double square(double number) {
			return number * number;
		}
		//returns cube of integer
		public static int cube(int number) {
			return number * number * number;
		}
		//returns average of two doubles
		public static double average(double number1, double number2) {
			return (number1 + number2)/2;
		}
		//returns average of three doubles
		public static double average(double number1, double number2, double number3) {
			return(number1 + number2 + number3)/3;
		}
		//returns a conversion of radians to degrees
		public static double toDegrees(double number) {
			double pi = 3.14159; //Pi approximation
			return (number/pi) * 180;
		}
		//returns a conversion of degrees to radians
		public static double toRadians(double number) {
			double pi = 3.14159; //Pi approximation
			return(number/180) * pi;
		}
		//returns the discriminant  of a quadratic equation in standard form
		public static double discriminant(double a, double b, double c) {
			return b*b-(4*a*c);
		}
		//returns the conversion of a mixed number to an improper fraction
		public static String toImproperFrac(int wholeNumber, int numerator, int denominator) {
			return ((wholeNumber*denominator+numerator) + "/" + (denominator));
		}
		//returns the conversion of a improper fraction to a mixed number
		public static String toMixedNum(int numerator, int denominator) {
			return((numerator/denominator) + "_" + (numerator%denominator) + "/" + denominator);
		}
		//returns the product of a binomial multiplication of form (ax + b)(cx + d)
		public static String foil(int a, int b, int c, int d, String variable) {
			return ((a*c) + variable + "^2 + " + (a*d + b*c) + variable + " + " + (b*d));
		}
		//determines whether integer is evenly divisible by another
		public static boolean isDivisibleBy(int number1, int number2) {
			if (number2 == 0) {
				throw new IllegalArgumentException ("Sorry, numbers cannot be divided by 0. Please enter a positive integer.");
			}
			boolean test = number1 % number2 == 0;
			return test;
		}
		//returns absolute value of number
		public static double absValue(double number) {
			if (number < 0 ) {
				return (number *-1);
			}
			else return (number);
		}
		//returns the greater number passed
		public static double max(double number1, double number2) {
			if (number1 > number2) {
				return (number1);
			}
			else /*if (number1 < number2)*/ {
				return (number2);					
			}
			//else {
				//return ("Numbers are equivalent.");}
		}
		//returns the greatest number of three passed numbers
		public static double max(double number1, double number2, double number3) {
			if (number1 >= number2 && number1 >= number3) {
				return (number1);
			}
			else if (number2 >= number1 && number2 >= number3) {
				return (number2);
			}
			else return (number3);
		}
		//returns the smaller number passed
		public static int min(int number1, int number2) {
			if (number1 < number2) {
				return (number1);
			}
			else return (number2);
		}
		
		//rounds a double correctly to 2 decimal places
		public static double round2(double number) {
			boolean negative = false;
			if (number < 0) {
				number = Quadratic.absValue(number);
				negative = true; 
			}
			number = number * 1000;
			double lastdigit = number % 10;
			if (lastdigit >= 5){
				number = number + 10;
			}
			number = number - number % 10;
			if (negative == true) {
				number = number * -1;
			}
			return (number * .001);
		}
		//returns a value to a positive integer power
		public static double exponent(double value, int power) {
			if (power < 0) {
				throw new IllegalArgumentException ("Sorry, this method does not accept negative powers. Please enter a positive power.");
			}
			double result = value; //result variable for final output
			for (int count = 0; count < power - 1; count++) { //value is used as a multiple
				result = result * value;
			}
			return (result);
		}
		//returns the factorial of the value passed
		public static int factorial(int number) {
			if (number < 0) {
				throw new IllegalArgumentException ("Sorry, this method does not accept negative integers. Please enter a positive integer.");
			}
			int result = number;
			for (int count = 1; count < number; count++){
				result = result * (number - count);
			}
			return (result);
		}
		//determines if integer is a prime number
		public static boolean isPrime(int number) {
			boolean test1 = (Quadratic.isDivisibleBy(number,2));
			boolean test2 = (Quadratic.isDivisibleBy(number,3));
			//boolean result;
			//test for divisibility
			if (number == 2 || number == 3) {
				return(true);
			}
			else if (test1 != false || test2 != false) { //divisibility is a condition for non-prime numbers
				return (false);		  			  //therefore the return needs to be opposite of isDivisibleBy output
			}
			else return (true);
		}
		//returns the greatest common factor of two integers
		public static int gcf(int number1, int number2) {
			number1 = (int) (Quadratic.absValue(number1));
			number2 = (int) (Quadratic.absValue(number2));
					
			//when numbers are each others gcf
			if (number1/number2 == 1 && number1 % number2 == 0) {
				return (number1);
			}
			
			//when numbers are not each others gcf
			else {
				int lownum = (Quadratic.min(number1, number2));
				int highnum = (int) (Quadratic.max(number1, number2));
				boolean test = (Quadratic.isDivisibleBy(highnum,lownum));
				
				//when lower number is the gcf
				if (test == true) {
					return (lownum);
				}
				//when you have to find compatible factor
				else {
					int possiblegcf = lownum;
					test = (Quadratic.isDivisibleBy(highnum,possiblegcf));
					
					//while loop to test factor of lownum with highnum
					while (test == false) {	
						boolean factortest = false;	//factorTest for for loop condition
						
						//Loop to find factor of lownum
						while (factortest == false) { 
							possiblegcf = possiblegcf - 1;					
							factortest = (Quadratic.isDivisibleBy(lownum,possiblegcf));
						}
						test = (Quadratic.isDivisibleBy(highnum,possiblegcf)); 
					}
					return (possiblegcf);
				}
			}
		}
		//Returns square root of values passed
		public static double sqrt(double number) {
			if (number < 0) {
				throw new IllegalArgumentException ("Sorry, you cannot take the square root of a negative value. Please enter a positive value");
			}
			double guess = 2;
			int count = 0;
			while (count <= 50) { //50 guesses are overkill but ensures accuracy 
				guess = 0.5 * ((number/guess) + guess); //Newton's Square Root Equation
				count++;
			}
			return (Quadratic.round2(guess));
		}
		//Returns the real roots of a quadratic equation
		public static String quadForm(double a, double b, double c) {
			double discriminant = (Quadratic.discriminant(a, b, c));
			if (discriminant < 0) {
				return ("no real roots");
			}
			else if (discriminant == 0) {
				double root = (-b/(2 * a));
				root = (Quadratic.round2(root));
				return (root + "");
			}
			else { // discriminant > 0
				double root1_x = ((-1 * b + (Quadratic.sqrt(discriminant))) / (2 * a));
				double root2_x = ((-1 * b - (Quadratic.sqrt(discriminant))) / (2 * a));
				root1_x = (Quadratic.round2(root1_x));
				root2_x = (Quadratic.round2(root2_x));
				return (root1_x + " and " + root2_x);
			}
		}
		//Returns description of a quadratic equation
		public static String quadrDescriber (double a, double b, double c) {
			// Printing Equation
			String ax = (a + "x^2");
			String bx = (b + "x");
			String k = (c + "");  
			if (b == 0) {
				bx = ("");
			}
			if (c == 0) {
				k = ("");
			}
			System.out.println("Description of the graph of:\n " + ax + bx + k +"\n");
			
			// Direction of graph
			System.out.print("Open: ");
			if (a < 0) {
				System.out.println("Down");
			}
			else if (a > 0) {
				System.out.println("Up");
			}
			else {	// when a = 0
				System.out.println("Error: Equation is linear not a quadratic equation");
			}

			// Axis of Symmetry and Vertex of graph
			double vertex_x = (-b/(2*a));
			System.out.println("Axis of Symmetry: " + vertex_x);
			double vertex_y = (Quadratic.round2((a * Quadratic.square(vertex_x) + b * vertex_x + c)));
			System.out.println("Vertex: (" + vertex_x + "," + vertex_y + ")");
			
			// X-intercepts
			double discriminant = (Quadratic.discriminant(a, b, c));
			System.out.print("x-intercpet(s): ");
			if (discriminant < 0) {
				System.out.println("No x-intercepts");
			}
			else if (discriminant == 0) {
				double root_x = (-b/(2 * a));
				System.out.println("(" + Quadratic.round2(root_x) + ",0)");
			}
			else { // discriminant > 0
				double root1_x = ((-1 * b + (Quadratic.sqrt(discriminant))) / (2 * a));
				double root2_x = ((-1 * b - (Quadratic.sqrt(discriminant))) / (2 * a));
				root1_x = (Quadratic.round2(root1_x));
				root2_x = (Quadratic.round2(root2_x));
				System.out.println("(" + root1_x + ",0) and (" + root2_x + ",0)");
			}
			// Y-intercepts
			System.out.print("y-intercept: " );
			return ("(0," + c + ")");
		}
		
}
