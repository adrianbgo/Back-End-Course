
public class Week1 {
	/**
	 * Visibility of Variables
	 */
	public int i = 1;
	private int j = 2;
	static int q = 3;
	final int p = 4;
	
	public static void main(String[] args) {
		/**
		 * Byte - 8 bits of data
		 * 8 
		 */
		byte B = 25;
		
		/**
		 * Int - Integer (whole number)
		 * 32
		 */
		int I = 1232132312;
		
		/**
		 * Short - Short Int (whole number)
		 * 16
		 */
		short S = 23434;
		
		/**
		 * Long - Long Int
		 * 64
		 */
		long L = 12312312;
		
		/**
		 * Float - Precision Decimal Type
		 * 32
		 * 6-7 decimal places
		 */
		float F = 1/3; // 0.333333
		
		/**
		 * Double - Double Precision Decimal Type
		 * 64
		 */
		double D = 1.33333333;
		
		/**
		 * Char - Character (Unicode)
		 * 16
		 */
		char C = '^';
		
		/**
		 * Boolean - True or False
		 * 1
		 */
		boolean Bool = true;
		
		/**
		 * String - Collection of chars
		 * unlimited space (16 bits per char)
		 */
		String Str = "sss";
		
		/**
		 * Operations
		 */
		
		/**
		 * Arithmetic
		 */
		int addition = 2 + 3;
		int subtraction = 2 - 3;
		int multiplication = 2 * 3;
		float division = 2 / 3;
		
		/**
		 * Assignment
		 */
		int equality = 0;
		equality += 1;
		equality *= 1;
		equality /= 2;
		equality -= 2;
		
		/**
		 * Logical
		 */
		boolean and = true && true;
		boolean or = true || false; // Truth Tables
		
		/**
		 * Relational
		 */
		boolean equals = 1 == 1;
		boolean nequals = 1 != 2;
		boolean greater = 1 > 0;
		boolean less = 1 < 2;
		boolean geq = 1 >= 0;
		boolean leq = 1 <= 2;
		
		/**
		 * Unary
		 */
		boolean nTrue = !true;
		int add = equality++;
		int sub = equality--;
		
		/**
		 * Ternary
		 */
		int ifTrue = nTrue == true ? 1 : 0; // Condition ? Result if True : Result if False
	}

}
