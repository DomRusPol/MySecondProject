package info.sjd.heirs.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testGetArea() {
		Triangle triangle = new Triangle();
		triangle.setBase(5);
		triangle.setHeight(18);
		
		assertEquals(45.0, triangle.getArea(), 0.1);
	}

}
