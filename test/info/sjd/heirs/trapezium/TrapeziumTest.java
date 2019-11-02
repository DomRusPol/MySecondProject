package info.sjd.heirs.trapezium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrapeziumTest {

	@Test
	void testGetArea() {
		Trapezium trapezium = new Trapezium();
		trapezium.setBase(8);
		trapezium.setSecondbase(14);
		trapezium.setHeight(11);
		
		assertEquals(121, trapezium.getArea());
	}

}
