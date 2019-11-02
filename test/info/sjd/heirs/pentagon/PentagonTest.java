package info.sjd.heirs.pentagon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PentagonTest {

	@Test
	void testGetArea() {
		Pentagon pentagon = new Pentagon();
		pentagon.setSide(3);
		pentagon.setApothem(2);
		
		assertEquals(15, pentagon.getArea());
		
	}

}
