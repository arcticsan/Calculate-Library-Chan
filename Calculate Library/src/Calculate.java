/* This class contains the methods to do various math related task.
 * @author Bryan Chan
 * @version 1 October 9, 2018
 */

public class Calculate {
	
	//returns square of integer
	public static int square(int number) {
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
	}
	
		//else {
			//return ("Numbers are equivalent.");}
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
	public static double min(double number1, double number2) {
		if (number1 < number2) {
			return (number1);
		}
		else return (number2);
	}
	
	//rounds a double correctly to 2 decimal places
	public static double round2(double number) {
		boolean negative = false;
		if (number < 0) {
			number = Calculate.absValue(number);
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
		return (number/1000);
	}
	//returns a value to a positive integer power
	public static double exponent(double base, int power) {
		if (power < 0) {
			throw new IllegalArgumentException ("Sorry, this method does not accept negative powers. Please enter a positive power.");
		}
		double product = base; //result variable for final output
		for (int count = 0; count < power - 1; count++) { //value is used as a multiple
			product = product * base;
		}
		return (product);
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
		for (int i = 2; i < number; i++) {
			if ((isDivisibleBy(number,i)) == true) {
				return false;
			}
		}
		return true;
	}	
	//returns the greatest common factor of two integers
	public static int gcf(int number1, int number2) {
		number1 = (int) (Calculate.absValue(number1));
		number2 = (int) (Calculate.absValue(number2));
		
		if (number1 == 0 || number2 == 0) {
			throw new IllegalArgumentException ("Sorry, there is no gcf for zero. Please enter a positive integer.");
		}
		int lownum = (int) (Calculate.min((double) number1, (double) number2));
		int highnum = (int) (Calculate.max(number1,number2));
		int factor = lownum;
		boolean factorable = (Calculate.isDivisibleBy(highnum,factor));
		while (factorable == false) {
			factor--;
			factorable = (Calculate.isDivisibleBy(highnum, factor) && (Calculate.isDivisibleBy(lownum, factor)));
		}
		return (factor);
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
		return (Calculate.round2(guess));
	}
	//Returns the real roots of a quadratic equation
	public static String quadForm(double a, double b, double c) {
		double discriminant = (Calculate.discriminant(a, b, c));
		if (discriminant < 0) {
			return ("no real roots");
		}
		else if (discriminant == 0) {
			double root = (-b/(2 * a));
			root = (Calculate.round2(root));
			return (root + "");
		}
		else { // discriminant > 0
			double root1 = ((-1 * b + (Calculate.sqrt(discriminant))) / (2 * a));
			double root2 = ((-1 * b - (Calculate.sqrt(discriminant))) / (2 * a));
			root1 = (Calculate.round2(root1));
			root2 = (Calculate.round2(root2));
			return (min(root1,root2) + " and " + max(root1,root2));
		}
	}
}
/* OLD VERSION OF gcf
public static int gcf(int number1, int number2) {
number1 = (int) (Calculate.absValue(number1));
number2 = (int) (Calculate.absValue(number2));
		
//numbers are each others gcf
if (number1/number2 == 1 && number1 % number2 == 0) {
	return (number1);
}

//numbers are not each others gcf
else {
	int lownum = (Calculate.min(number1, number2));
	int highnum = (int) (Calculate.max(number1, number2));
	boolean divisibility = (Calculate.isDivisibleBy(highnum,lownum));
	
	//lower number is the gcf
	if (divisibility == true) {
		return (lownum);
	}
	//lownum is not gcf
	else {
		int possiblegcf = lownum;
		
		//while loop to find gcf compatible factor of lownum and highnum
		while (divisibility == false) {	
			boolean factorable = false;	//factorable for for loop condition
			
			//Loop to find gcf factor of lownum
			while (factorable == false) { 
				possiblegcf = possiblegcf - 1;					
				factorable = (Calculate.isDivisibleBy(lownum,possiblegcf));
			}
			divisibility = (Calculate.isDivisibleBy(highnum,possiblegcf)); 
		}
		return (possiblegcf);
	}
}
}*/