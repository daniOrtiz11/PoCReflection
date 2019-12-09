/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.entities;

public class CircumferencePojo extends FigurePojo{

	private double radius;

	public CircumferencePojo(int radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		// TODO Auto-generated method stub
		double area = 0;
		area = Math.PI * Math.pow(this.radius, 2);
		return this.roundOperations(area);
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		double perimeter = 0;
		perimeter = 2 * Math.PI * this.radius;
		return this.roundOperations(perimeter);
	}
		
}
