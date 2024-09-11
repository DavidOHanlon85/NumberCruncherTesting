package math.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberCruncherTest {
	
	
	// test data
	
	int num1;
	int num2;
	int num3;
	int num4;
	NumberCruncher nc;

	@BeforeEach
	void setUp() throws Exception {
		num1 = 2;
		num2 = 4;
		num3 = 6;
		num4 = 2;
		nc = new NumberCruncher();
	}

	@Test
	void testAddNumbersTwoInts() {
		int expected = 6;
		int actual = nc.addNumbers(num1, num2);
		assertEquals(expected, actual);
		
		expected = 10;
		actual = nc.addNumbers(num2, num3);
		
		assertEquals(expected, actual);
		
		assertEquals(8, nc.addNumbers(num1, num3));
	}

	@Test
	void testAddNumbersIntIntInt() {
		int expected = 12;
		int actual = nc.addNumbers(num1, num2, num3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMultiply2Ints() {
		int expected = 8;
		int actual = nc.multiplyNumbers(num1, num2);
		
		assertEquals(expected, actual);
		
		expected = 24;
		actual = nc.multiplyNumbers(num2, num3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testmuliply3Ints() {
		int expected = 48;
		int actual = nc.multiplyNumbers(num1, num2, num3);
		
		assertEquals(expected, actual);
		
		assertEquals(8, nc.multiplyNumbers(num1, num4, num1));
		
		assertEquals(16, nc.multiplyNumbers(num1, num2, num4));
		
	}

	@Test
	void testDivideNumbersDoubles() {
		double topNumber = 10;
		double divideBy = 2;
		
		double expected = 5;
		double actual = nc.divideNumbers(topNumber, divideBy);
		
		assertEquals(expected, actual, 0.001);
		
		actual = nc.divideNumbers(10, 3.0);
		
		assertEquals(3.333, actual, 0.001);
	}
	
	@Test
	void testDivideNumbersInts() {
		int expected = 3;
		try {
			int actual;
			actual = nc.divideNumbers(num3, num1);
			assertEquals(expected, actual);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

	@Test
	void testDivideIntsDivByZero() {
		int first = 7;
		int second = 0;
		
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			nc.divideNumbers(first, second);
			});
		
		String expectedMessage = "Can't divide by 0";
		assertEquals(expectedMessage, exp.getMessage());
		
		
	}
	
}
