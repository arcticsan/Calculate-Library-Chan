/* This calls various methods in the Calculate Library.
 * Client Code
 * @author Bryan Chan
 * @version 0 September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7,"n"));
		System.out.println(Calculate.isDivisibleBy(7,2));
		System.out.println(Calculate.absValue(-7.0));
		System.out.println(Calculate.max(7,2));
		System.out.println(Calculate.max(3,3.00999));
		System.out.println(Calculate.max(3.0,3));
		System.out.println(Calculate.max(3,1,2));
		System.out.println(Calculate.max(1,2,3));
		System.out.println(Calculate.max(1,3,2));
	}
}