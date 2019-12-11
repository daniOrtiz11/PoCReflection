/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The FigurePojo class is using for show a general Figure.
 * It's the parent class of CircumferencePojo and SquarePojo.
 */
public abstract class FigurePojo {

	protected double roundOperations(double beforeRound) {
	    BigDecimal bd = new BigDecimal(Double.toString(beforeRound));
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	protected abstract double perimeter();
	protected abstract double area();
}
