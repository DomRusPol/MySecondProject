package info.sjd.heirs.triangle;

import info.sjd.abstraction.AbstractShape;

public class Triangle extends AbstractShape {

	private double base;
	private double height;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return (base * height) / 2;
	}

}
