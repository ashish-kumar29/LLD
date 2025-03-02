package com.factory;

import com.shape.Circle;
import com.shape.Rectangle;
import com.shape.Shape;
import com.shape.Square;

public class ShapeFactory {
	
	public Shape getShape(String input) {
		
		switch(input) {
			case "CIRCLE":
				return new Circle();
			case "RECTANGLE":
				return new Rectangle();
			case "SQUARE":
				return new Square();
			default:
				return null;
		}
	}
}
