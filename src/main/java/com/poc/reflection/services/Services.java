/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.reflection.dao.Dao;
import com.poc.reflection.dao.DaoImpl;

/**
 * The Services class provide a way to interact with some pojos and functionality.
 * In this case only have one general method for all the operations from controller.  
 */
@Service
public class Services {
	
	private Dao dao;
	
	public Services() {
		this.dao = new DaoImpl();
	}

	public double operation(List<?> figures, String method) {
		double result = 0;
		for (Object figure : figures) {
			//Calling to first reflection method
			Object currentResult = dao.operationByFigure(figure, method);
			
			//Calling to second reflection method
			//Object currentResult = dao.operationByFigure2(figure, method);
			
			//Calling to third reflection method
			//double dummyArg = 5;
			//Object currentResult = dao.operationByFigure3(figure, method, dummyArg);
			
			result = result + (double)currentResult;
		}
		return result;
	}
	
}
