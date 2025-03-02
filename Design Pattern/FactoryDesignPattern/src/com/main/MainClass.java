package com.main;

import com.factory.ShapeFactory;

public class MainClass {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		shapeFactory.getShape("CIRCLE").draw();
		shapeFactory.getShape("RECTANGLE").draw();
		shapeFactory.getShape("SQUARE").draw();

	}

}
