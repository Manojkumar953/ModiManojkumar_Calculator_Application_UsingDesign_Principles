package Works;
import static org.junit.Assert.*;

import org.junit.Test;
//import Works.App.*;

public class AppTest {

	//@Test
	/*
	 * TestCases for Addition
	 */
	public void testAdd() {
		//public App obj;
		App o = new App();
		assertEquals(8,o.add(5, 3));
		assertEquals(-6,o.add(3, -9));
		assertEquals(-14,o.add(-5, -9));
		assertEquals(2,o.add(2,2));
		
	}
	//@Test
		/*
		 * Test Cases for Subtraction
		 */
	public void testSub() {
		App o = new App();
		assertEquals(2,o.sub(4,2));
		assertEquals(4,o.sub(4,0));
		assertEquals(-2,o.sub(-4,2));
		assertEquals(-4,o.sub(-4,0));
		
		}
	//@Test
	/*
	 * Test Cases for Multiplication
	 */
	public void testMul() {
		App o = new App();
		assertEquals(35,o.mul(5, 7));
		assertEquals(-21,o.mul(-3, 7));
		assertEquals(20,o.mul(-5, -4));
		assertEquals(2,o.mul(2,1));
		
	}
	@Test
	/*
	 * Test Cases for Division
	 */
	public void testDiv() {
		App o = new App();
		assertEquals(3,o.div(15, 5));
		assertEquals(-1,o.div(0, 0));
		assertEquals(-1,o.div(15, 0));
		assertEquals(-1,o.div(9, 99));
	}
}