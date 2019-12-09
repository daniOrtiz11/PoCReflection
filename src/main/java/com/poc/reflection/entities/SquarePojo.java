/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.entities;

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
		// TODO Auto-generated method stub
		double area = 0;
		area = this.side * this.side;
		return this.roundOperations(area);
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		double perimeter = 0;
		perimeter = 4 * this.side;
		return this.roundOperations(perimeter);
	}
	
}
