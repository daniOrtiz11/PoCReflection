/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.entities;

/**
 * The SquarePojo class is using for show a Square with a side and its operations.
 * Extends general pojo FigurePojo.
 */
public class SquarePojo extends FigurePojo{

	private double side;

	public SquarePojo(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double area() {
		double area = 0;
		area = this.side * this.side;
		return this.roundOperations(area);
	}

	public double perimeter() {
		double perimeter = 0;
		perimeter = 4 * this.side;
		return this.roundOperations(perimeter);
	}
	
}
