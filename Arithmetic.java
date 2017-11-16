public class Arithmetic {
	/**Author: Matt Busch
	 * Date:11/16/17
	 * */
	public static void main(String[] args) {
		/**Purpose: call on the three methods to output the results
		 * */
		System.out.println(mathFunc1(5));
		System.out.println(mathFunc2(5, 5));
		System.out.println(mathFunc3(4, 5, 6));

	}
	public static int mathFunc1 (int n) {
		/**Purpose: to solve n^10 without math class
		 * */
		int x = n*n*n*n*n*n*n*n*n*n;
		return x;
	}
	public static int mathFunc2 (int n, int x) {
		/** To solve n + y without math class
		 * */
		int y = n + x;
		return y;
	}
	public static double mathFunc3 (double n, int y, int x) {
		/**To solve square root of n + absolute value of y plus x^y without math class
		 * */
		double z = sqrt(n);
		double a = z + (abs(y)) + findPower(x, y);
		return a;
	}
	public static double abs(double n) {
		/**Purpose: To provide absolute valu of y to mathFunc3
		 * */
		return (n <= 0) ? 0-n: n;
	}
	public static double sqrt(double n) {
		/**Purpose: To provide the square root of n to mathFunc3
		 * */
		double t;
		double squareRoot = n / 2;
		do {
			t = squareRoot;
			squareRoot = (t + (n / t)) / 2;
		} while ((t - squareRoot) != 0);
		return squareRoot;
	}
	public static int findPower(int x, int y) {
		/**Purpose: To provide x^y to mathFunc3
		 * */
		int output = x;
		if (y==0)
			return 1;
		while (y > 1) {
			output*=x;
			y--;
		}
		return output;
	}

}

