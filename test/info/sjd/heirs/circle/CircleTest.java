package info.sjd.heirs.circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testGetArea() {
		Circle circle = new Circle();
		circle.setRadius(11);
		
		double result = circle.getArea();

		assertEquals(380.13271, circle.getArea(), 0.00001);
	}

}
