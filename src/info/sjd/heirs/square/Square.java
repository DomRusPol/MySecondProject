package info.sjd.heirs.square;

import info.sjd.abstraction.Shape;

public class Square implements Shape {

	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

}
