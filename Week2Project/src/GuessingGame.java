import java.util.Scanner;
import java.util.Random;
/**
 * DRY
 * Don't 
 * Repeat
 * Yourself
 * @author Adrian Bauer
 *
 */
public class GuessingGame {
	static Random rand = new Random();
	static int x = rand.nextInt(100);
	
	public static void main (String[] args) {
		try (Scanner guesser = new Scanner(System.in)) {
			System.out.println("Enter guess between 1-100");
			int guess;
			do {
				guess = guesser.nextInt();
				if (guess > x) {
					System.out.println("Too High");
				} else if (guess < x){
					System.out.println("Too Low");
				} else {
					System.out.println("Just Right");
				}
			} while(guess != x);
		}
	}
}