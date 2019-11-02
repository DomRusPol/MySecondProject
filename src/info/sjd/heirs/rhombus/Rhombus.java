package info.sjd.heirs.rhombus;

import info.sjd.abstraction.AbstractShape;

public class Rhombus extends AbstractShape {

	private double diagonal;
	private double seconddiagonal;

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public double getSeconddiagonal() {
		return seconddiagonal;
	}

	public void setSeconddiagonal(double seconddiagonal) {
		this.seconddiagonal = seconddiagonal;
	}

	@Override
	public double getArea() {
		return (diagonal * seconddiagonal) / 2;
	}

}
