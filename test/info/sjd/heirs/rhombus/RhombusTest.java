package info.sjd.heirs.rhombus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RhombusTest {

	@Test
	void testGetArea() {
		Rhombus rhombus = new Rhombus();
		rhombus.setDiagonal(53);
		rhombus.setSeconddiagonal(34);

		assertEquals(901, rhombus.getArea());
	}

}
