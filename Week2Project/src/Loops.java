
public class Loops {
	{
		/**
		 * For
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		/**
		 * While
		 */
		int x = 0;
		while (x < 10) {
			System.out.println("Hello");
			x++; // x = x + 1
		}

		/**
		 * Do-While
		 */
		do {
			System.out.println("Hello");
		} while (x > 10);

		/**
		 * Breaking out of a loop
		 */
		while (true) {
			break;
		}

		for (int j = 1; j <= 10; j++) {
			if (j == 4) {
				continue;
			}
		}

		/**
		 * Print out only the even numbers between 1 and 100
		 */
		for (int k = 1; k <= 100; k++) {
			if (k % 2 != 0) {
				continue;
			}
			System.out.println(k);
		}
	}
}
