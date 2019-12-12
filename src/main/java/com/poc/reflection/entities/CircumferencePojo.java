/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.entities;

/**
 * The CircumferencePojo class is using for show a Circumference with a radius and its operations.
 * Extends general pojo FigurePojo.
 */
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
		double area = 0;
		area = Math.PI * Math.pow(this.radius, 2);
		return this.roundOperations(area);
	}

	public double perimeter() {
		double perimeter = 0;
		perimeter = 2 * Math.PI * this.radius;
		return this.roundOperations(perimeter);
	}
	
	public double areaArgs(double radius) {
		double area = 0;
		area = Math.PI * Math.pow(radius, 2);
		return this.roundOperations(area);
	}
	
	public double perimeterArgs(double radius) {
		double perimeter = 0;
		perimeter = 2 * Math.PI * radius;
		return this.roundOperations(perimeter);
	}
	
	
		
}
