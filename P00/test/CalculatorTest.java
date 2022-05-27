import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// fail("Not yet implemented");
		int a = 1234;
		int b = 8765;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 9999;
		assertEquals(actual, expected);
	}

	@Test
	public final void testSubtract() {
		// fail("Not yet implemented");
		int a = 9876;
		int b = 4321;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);

		int expected = 5555;
		assertEquals(actual, expected);
	}

	@Test
	public final void testMultiple() {
		// fail("Not yet implemented");
		int a = 100;
		int b = 4;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);

		int expected = 400;
		assertEquals(actual, expected);
	}

	@Test
	public final void testDivide() {
		// fail("Not yet implemented");
		int a = 648;
		int b = 3;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 216;
		assertEquals(actual, expected);
	}

	@Test
	public void testDivideWith0Denominator() {
		int a = 100;
		int b = 0;

		try {
			Calculator cal = new Calculator();
			cal.divide(a, b);
			// if operations completes, that means the test fail
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			// if the correct exception with correct message is thrown, test pass
			assertEquals("Division by zero is not allowed", e.getMessage());
		} catch (Throwable t) {
			// if other exception with some message is thrown, test failed
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}
}
