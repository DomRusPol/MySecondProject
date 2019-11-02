package info.sjd.heirs.elipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElipseTest {

	@Test
	void testGetArea() {
		Elipse elipse = new Elipse();
		elipse.setAxis(8);
		elipse.setSecondaxis(4);
		
		assertEquals(25.13274, elipse.getArea(), 0.00001);
	}

}
