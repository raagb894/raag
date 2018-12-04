package javaTpoint.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javatPoint.logic.Calculations;

public class TestLogic {
	@Test
	public void testFindMax() {
		assertEquals(4, Calculations.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, Calculations.findMax(new int[] { -12, -1, -3, -4, -2 }));
	}

}
