package info.sjd;

import java.util.logging.Logger;
import info.sjd.heirs.circle.Circle;
import info.sjd.heirs.square.Square;
import info.sjd.heirs.triangle.Triangle;

public class AppRunner {

	public static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		circle1.setRadius(11);

		Circle circle2 = new Circle();
		circle2.setRadius(29);

		Circle circle3 = new Circle();
		circle3.setRadius(47);

		logger.info("Area of circle with radius" + circle1.getRadius() + " is " + circle1.getArea());
		logger.info("Area of circle with radius" + circle2.getRadius() + " is " + circle2.getArea());
		logger.info("Area of circle with radius" + circle3.getRadius() + " is " + circle3.getArea());

		Square square = new Square();
		square.setSide(21);

		Square square62 = new Square();
		square62.setSide(62);

		Square square38 = new Square();
		square38.setSide(38);

		logger.info("Area of square with side" + square.getSide() + " is " + square.getArea());
		logger.info("Area of square with side" + square62.getSide() + " is " + square62.getArea());
		logger.info("Area of square with side" + square38.getSide() + " is " + square38.getArea());

		Triangle triangle = new Triangle();
		triangle.setBase(69);
		triangle.setHeight(96);

		Triangle triangleII = new Triangle();
		triangleII.setBase(15);
		triangleII.setHeight(51);

		Triangle triangleIII = new Triangle();
		triangleIII.setBase(7);
		triangleIII.setHeight(21);

		logger.info("Area of triangle with base" + triangle.getBase() + " and height " + triangle.getHeight() + " is "
				+ triangle.getArea());
		logger.info("Area of triangle with base" + triangleII.getBase() + " and height " + triangleII.getHeight()
				+ " is " + triangleII.getArea());
		logger.info("Area of triangle with base" + triangleIII.getBase() + " and height " + triangleIII.getHeight()
				+ " is " + triangleIII.getArea());

	}

}
