package info.sjd;

import java.util.logging.Logger;

import info.sjd.heirs.circle.Circle;
import info.sjd.heirs.square.Square;
import info.sjd.heirs.triangle.Triangle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(11);

		logger.info("Area of circle with radius" + circle.getRadius() + " is " + circle.getArea());

		Square square = new Square();
		square.setSide(21);

		logger.info("Area of square with side" + square.getSide() + " is " + square.getArea());

		Triangle triangle = new Triangle();
		triangle.setBase(5);
		triangle.setHeight(18);

		logger.info("Area of triangle with base" + triangle.getBase() + " is " + triangle.getArea());

	}

}
