/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.reflection.dao.Dao;
import com.poc.reflection.dao.DaoImpl;

@Service
public class Services {
	
	private Dao dao;
	
	public Services() {
		this.dao = new DaoImpl();
	}

	public double operation(List<?> figures, String method) {
		double result = 0;
		for (Object figure : figures) {
			Object currentResult = dao.operationByFigure(figure, method);
			result = result + (double)currentResult;
		}
		return result;
	}
	
}
