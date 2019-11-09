package info.sjd.collections;

import java.util.logging.Logger;

import java.util.ArrayList;

import info.sjd.abstraction.Shape;

import info.sjd.AppRunner;

public class ShapesCollection implements Shape {

	public static Logger logger = Logger.getLogger(ShapesCollection.class.getName());

	public static void main(String[] args) {

		ArrayList<String> shapes = new ArrayList<String>();

		shapes.add("circle1");
		shapes.add("circle2");
		shapes.add("circle3");

		System.out.println(shapes.size());
	}

	@Override
	public double getArea() {
		return 0;

	}

}
