package info.sjd.heirs.pentagon;

import info.sjd.abstraction.AbstractShape;

public class Pentagon extends AbstractShape {

	private double side;
	private double apothem;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getApothem() {
		return apothem;
	}

	public void setApothem(double apothem) {
		this.apothem = apothem;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((side * apothem) / 2) * 5;
	}

}
