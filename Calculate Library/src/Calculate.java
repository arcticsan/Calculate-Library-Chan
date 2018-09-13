/* This class contains the methods to do various math related task.
 * @author Bryan Chan
 * @version 0 September 6, 2018
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
	//
}	