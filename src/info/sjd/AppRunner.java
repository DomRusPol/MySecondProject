package info.sjd;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import info.sjd.abstraction.Shape;
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

	//	logger.info("Area of circle with radius" + circle1.getRadius() + " is " + circle1.getArea());
	//	logger.info("Area of circle with radius" + circle2.getRadius() + " is " + circle2.getArea());
	//	logger.info("Area of circle with radius" + circle3.getRadius() + " is " + circle3.getArea());

		Square square1 = new Square();
		square1.setSide(21);

		Square square2 = new Square();
		square2.setSide(62);

		Square square3 = new Square();
		square3.setSide(38);

	//	logger.info("Area of square with side" + square1.getSide() + " is " + square1.getArea());
	//	logger.info("Area of square with side" + square2.getSide() + " is " + square2.getArea());
	//	logger.info("Area of square with side" + square3.getSide() + " is " + square3.getArea());

		Triangle triangle1 = new Triangle();
		triangle1.setBase(690);
		triangle1.setHeight(960);

		Triangle triangle2 = new Triangle();
		triangle2.setBase(15);
		triangle2.setHeight(51);

		Triangle triangle3 = new Triangle();
		triangle3.setBase(7);
		triangle3.setHeight(21);

	//	logger.info("Area of triangle with base" + triangle1.getBase() + " and height " + triangle1.getHeight() + " is "
	//			+ triangle1.getArea());
	//	logger.info("Area of triangle with base" + triangle2.getBase() + " and height " + triangle2.getHeight() + " is "
	//			+ triangle2.getArea());
	//	logger.info("Area of triangle with base" + triangle3.getBase() + " and height " + triangle3.getHeight() + " is "
	//			+ triangle3.getArea());

		List<Shape> shapes = new ArrayList<>();

		shapes.add(circle1);
		shapes.add(circle2);
		shapes.add(circle3);
		shapes.add(square1);
		shapes.add(square2);
		shapes.add(square3);
		shapes.add(triangle1);
		shapes.add(triangle2);
		shapes.add(triangle3);

		logger.info(String.valueOf(shapes.size()));

		Shape maxShape = shapes.get(0);
		for (int i = 1; i < shapes.size(); i++) {
			if (maxShape.getArea() < shapes.get(i).getArea()) {
				maxShape = shapes.get(i);
			}
		}

		logger.info(String.valueOf("Area of max shape is " + maxShape.getArea() + " and it's a " + maxShape.getClass().getSimpleName()));

	}

}
