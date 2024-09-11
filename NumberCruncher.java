/**
 * 
 */
package math.examples;

/**
 * 
 */
public class NumberCruncher {
	
	/**
	 * Add two numbers return result
	 * @param num1
	 * @param num2
	 * @return the sum of the two arguments
	 */ 
	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}
	
	/**
	 * Add three numbers return result
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return the sum of the three arguments
	 */
	public int addNumbers(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		return result;
	}
	
	/**
	 * multiply num1 by num2
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int multiplyNumbers(int num1, int num2) {
		return num1 * num2;
	}
	
	public int multiplyNumbers(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}

	
	/**
	 * Divide num1 by num2 (double version)
	 * @param num1
	 * @param num2
	 * @return the result of the division
	 * @throws 
	 */
	public double divideNumbers(double num1, double num2) {
		if (num2== 0) {
			throw new IllegalArgumentException("Don'y divide by zero");
		} else{ 
			return num1 / num2;
		}
	}
	
	
	/**
	 * Divide num1 by num2 (int version)
	 * @param num1
	 * @param num2
	 * @return
	 * @throws IllegalArgumentException if num 2 is zero
	 */
	public int divideNumbers(int num1, int num2) throws IllegalArgumentException {
		if (num2 != 0) {
		return num1 / num2;
		} else {
			throw new IllegalArgumentException("Can't divide by 0");
		}
	}
	
}
