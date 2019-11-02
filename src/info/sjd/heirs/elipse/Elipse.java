package info.sjd.heirs.elipse;

import info.sjd.abstraction.AbstractShape;

public class Elipse extends AbstractShape {

	private double axis;
	private double secondaxis;

	public double getAxis() {
		return axis;
	}

	public void setAxis(double axis) {
		this.axis = axis;
	}

	public double getSecondaxis() {
		return secondaxis;
	}

	public void setSecondaxis(double secondaxis) {
		this.secondaxis = secondaxis;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * ((axis / 2) * (secondaxis / 2));
	}

}
