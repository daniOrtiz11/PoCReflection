/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DaoImpl implements Dao{

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

}
