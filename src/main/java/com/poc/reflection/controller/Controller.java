package com.poc.reflection.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    public double area(@RequestParam int dummyOption) {
    	double value = 0;
    	List<Object> inputList = new ArrayList<Object>();
    	FigurePojo figure = null;
    	if(dummyOption == 1) {
    		figure = new SquarePojo(2);
    	} else if(dummyOption == 2){
    		figure = new CircumferencePojo(5);
    	}
    	inputList.add(figure);
    	value = this.service.operation(inputList, "area");
    	return value;
    }
    
    @RequestMapping( value = "/perimeter", method=RequestMethod.GET)
    public double perimeter(@RequestParam int dummyOption) {
    	double value = 0;
    	List<Object> inputList = new ArrayList<Object>();
    	FigurePojo figure = null;
    	if(dummyOption == 1) {
    		figure = new SquarePojo(2);
    	} else if(dummyOption == 2){
    		figure = new CircumferencePojo(5);
    	}
    	inputList.add(figure);
    	value = this.service.operation(inputList, "perimeter");
    	return value;
    }
}
