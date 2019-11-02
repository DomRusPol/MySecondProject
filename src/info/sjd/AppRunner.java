package info.sjd;

import java.util.logging.Logger;

import info.sjd.heirs.circle.Circle;
import info.sjd.heirs.elipse.Elipse;
import info.sjd.heirs.pentagon.Pentagon;
import info.sjd.heirs.rectangle.Rectangle;
import info.sjd.heirs.rhombus.Rhombus;
import info.sjd.heirs.square.Square;
import info.sjd.heirs.trapezium.Trapezium;
import info.sjd.heirs.triangle.Triangle;

public class AppRunner {

	public static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(11);

		logger.info("Area of circle with radius" + circle.getRadius() + " is " + circle.getArea());

		Square square = new Square();
		square.setSide(21);

		logger.info("Area of square with side" + square.getSide() + " is " + square.getArea());

		Trapezium trapezium = new Trapezium();
		trapezium.setBase(8);
		trapezium.setSecondbase(14);
		trapezium.setHeight(11);

		logger.info("Area of trapezium with bases" + trapezium.getBase() + "," + trapezium.getSecondbase() + " and height " + trapezium.getHeight() + " is " + trapezium.getArea());

		Triangle triangle = new Triangle();
		triangle.setBase(5);
		triangle.setHeight(18);

		logger.info("Area of triangle with base" + triangle.getBase() +" and height " + triangle.getHeight() + " is " + triangle.getArea());
		
		Rhombus rhombus = new Rhombus();
		rhombus.setDiagonal(53);
		rhombus.setSeconddiagonal(34);
		
		logger.info("Area of rhombus with diagonals" + rhombus.getDiagonal() + " and " + rhombus.getSeconddiagonal() + " is " + rhombus.getArea());
		
		Rectangle rectangle = new Rectangle(); 
		rectangle.setSideI(6);
		rectangle.setSideII(99);
		
		logger.info("Area of rectangle with firstside" + rectangle.getSideI() + " and secondside " + rectangle.getSideII() + " is " + rectangle.getArea());
		
		Elipse elipse = new Elipse();
		elipse.setAxis(8);
		elipse.setSecondaxis(4);
		
		logger.info("Area of elipse with axises" + elipse.getAxis() + " and " + elipse.getSecondaxis() + " is " + elipse.getArea());
		
		Pentagon pentagon = new Pentagon();
		pentagon.setSide(3);
		pentagon.setApothem(2);
		
		logger.info("Area of Pentagon with side" + pentagon.getSide() + " and apothem " + pentagon.getApothem() + " is " + pentagon.getArea());

	}

}
