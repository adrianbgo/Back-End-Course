
public class Conditionals {

	public static void main(String[] args) {
		/**
		 * Conditionals
		 */
		int x = 15;

		/**
		 * Single conditional if/else statement
		 */
		if (x > 10) {
			System.out.println("x is greater than 10");
		} else {
			System.out.println("x is less than 10");
		}

		/**
		 * Multiple Conditional
		 */
		if (x > 10) {
			System.out.println(">10");
		} else if (x > 5) {
			System.out.println(">5");
		} else {
			System.out.println("<6");
		}

		/**
		 * Switch Statement
		 */
		switch (x) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("not one, two, or three");
			break;
		}

		/**
		 * Ternary Statement
		 */
		System.out.println((x < 10) ? "x is less than 10" : "x is greater than 10");

	}

}
