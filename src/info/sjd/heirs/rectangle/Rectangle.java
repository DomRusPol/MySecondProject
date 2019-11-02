package info.sjd.heirs.rectangle;

import info.sjd.abstraction.AbstractShape;

public class Rectangle extends AbstractShape {

	private double sideI;
	private double sideII;

	public double getSideI() {
		return sideI;
	}

	public void setSideI(double sideI) {
		this.sideI = sideI;
	}

	public double getSideII() {
		return sideII;
	}

	public void setSideII(double sideII) {
		this.sideII = sideII;
	}

	@Override
	public double getArea() {
		return sideI * sideII;
	}

}
