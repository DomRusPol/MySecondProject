package info.sjd.heirs.trapezium;

import info.sjd.abstraction.AbstractShape;

public class Trapezium extends AbstractShape {

	private double base;
	private double secondbase;
	private double height;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getSecondbase() {
		return secondbase;
	}

	public void setSecondbase(double secondbase) {
		this.secondbase = secondbase;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return ((base + secondbase) / 2) * height;
	}

}
