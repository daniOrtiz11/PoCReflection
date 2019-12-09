/**
 * @author @daniOrtiz11
 *
 */

package com.poc.reflection.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.reflection.entities.CircumferencePojo;
import com.poc.reflection.entities.FigurePojo;
import com.poc.reflection.entities.SquarePojo;
import com.poc.reflection.services.Services;

@RestController
public class Controller {
	
	@Autowired
	private Services service;
	
    @RequestMapping( value = "/area", method=RequestMethod.GET)
    public ResponseEntity<Object> area(@RequestParam int dummyOption) {
    	double value = 0;
    	List<Object> inputList = getFigureByDummy(dummyOption);
    	value = this.service.operation(inputList, "area");
    	return ResponseEntity.ok(value);
    }
    
    @RequestMapping( value = "/perimeter", method=RequestMethod.GET)
    public ResponseEntity<Object> perimeter(@RequestParam int dummyOption) {
    	double value = 0;
    	List<Object> inputList = getFigureByDummy(dummyOption);
    	value = this.service.operation(inputList, "perimeter");
    	return ResponseEntity.ok(value);
    }
    
    private List<Object> getFigureByDummy(int option){
    	List<Object> inputList = new ArrayList<Object>();
    	FigurePojo figure = null;
    	if(option == 1) {
    		figure = new SquarePojo(2);
    	} else if(option == 2){
    		figure = new CircumferencePojo(5);
    	}
    	inputList.add(figure);
    	return inputList;
    }
}
