package info.sjd.heirs.rectangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testGetArea() {
		Rectangle rectangle = new Rectangle();
		rectangle.setSideI(6);
		rectangle.setSideII(99);

		assertEquals(594, rectangle.getArea());
	}
	
}