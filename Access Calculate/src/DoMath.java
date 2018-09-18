/* This calls various methods in the Calculate Library.
 * Client Code
 * @author Bryan Chan
 * @version 1 September 17, 2018
 * @version 0 September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		//Part 1
		System.out.println("Part 1");
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(3.5,4.2));
		System.out.println(Calculate.average(3.5,4.2,10));
		System.out.println(Calculate.toDegrees(3.1415));
		System.out.println(Calculate.toRadians(90));
		System.out.println(Calculate.discriminant(3,1,2.5));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7,"n"));
		
		//Part 2
		System.out.println("\nPart 2");
		System.out.println(Calculate.isDivisibleBy(7,2));
		System.out.println(Calculate.isDivisibleBy(8,2));
		System.out.println(Calculate.absValue(-7.0));
		System.out.println(Calculate.max(7,2));
		System.out.println(Calculate.max(3,3.00999));
		System.out.println(Calculate.max(3.0,3));
		System.out.println(Calculate.max(3,1,2));
		System.out.println(Calculate.max(1,2,3));
		System.out.println(Calculate.max(1,3,2));
		System.out.println(Calculate.min(7,2));
		System.out.println(Calculate.round2(3.1445));
		System.out.println(Calculate.round2(3.1455));
		
		//Part 3
		System.out.println("\nPart 3");
		System.out.println(Calculate.exponent(3,4));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(7));
		System.out.println(Calculate.isPrime(144));
		System.out.println(Calculate.gcf(5,5));
		System.out.println(Calculate.gcf(10,5));
		System.out.println(Calculate.gcf(20,24));
		System.out.println(Calculate.gcf(98,56));
		System.out.println(Calculate.sqrt(121));
		System.out.println(Calculate.sqrt(125));
		
	}
}