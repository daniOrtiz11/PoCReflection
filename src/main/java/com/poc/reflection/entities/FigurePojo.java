/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FigurePojo {

	protected double roundOperations(double beforeRound) {
	    BigDecimal bd = new BigDecimal(Double.toString(beforeRound));
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
