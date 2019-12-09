/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.dao;

/**
 * The Dao interface is the representation of the DAO Pattern 
 */
public interface Dao {
	public Object operationByFigure(Object figure, String method);
	public Object operationByFigure2(Object figure, String method);
}
