package info.sjd.heirs.square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testGetArea441() {
		Square square = new Square();
		square.setSide(21);

		double result = square.getArea();

		assertEquals(441.0, result, 0.1);
	}

}
