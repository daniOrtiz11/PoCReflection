/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * The DaoImpl class is the implementation of the DAO Pattern 
 */
public class DaoImpl implements Dao{

	/*
	 * First reflection method. 
	 * It is invoked directly without checking if it exists in the class. 
	 * More dangerous but more efficient.
	 */
	@Override
	public Object operationByFigure(Object figure, String methodStr) {
		Object value = 0;
		try {
			Method method = figure.getClass().getMethod(methodStr);
			try {
				value = method.invoke(figure);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	/*
	 * Second reflection method. 
	 * In it all methods are previously looped to get more security.
	 * Less dangerous and less efficient too.
	 */
	@Override
	public Object operationByFigure2(Object figure, String methodStr) {
		Object value = 0;
		Method[] methods = figure.getClass().getMethods();
		for (Method  m: methods) {
			if(m.getName().equals(methodStr)) {
				try {
					value = m.invoke(figure);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return value;
	}

}
