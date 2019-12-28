package com.jain.schl.sclcnfsvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jain.schl.sclcnfsvc.exception.SclConfNotFoundException;
import com.jain.schl.sclcnfsvc.model.SclConfModel;
import com.jain.schl.sclcnfsvc.service.SclConfService;

@RestController
public class SclConfController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SclConfController.class);
	@Autowired
	private SclConfService sclConfService;
	
	@GetMapping(value="/searchById/{id}")
	public SclConfModel getConfById(@PathVariable(value = "id", required= true) Long id) throws SclConfNotFoundException{
		LOGGER.info("Find By Id : {}", id);		
		return sclConfService.findById(id);
	}
	
	@GetMapping(value="/searchByKey/{key}")
	public SclConfModel getConfByKey(@PathVariable("key") String key) throws SclConfNotFoundException{
		return sclConfService.findByAttKey(key);
	}
}
