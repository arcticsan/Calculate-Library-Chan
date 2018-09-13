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
	}
}