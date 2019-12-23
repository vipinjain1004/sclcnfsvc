package com.jain.schl.sclcnfsvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SclConfApi {

	@GetMapping(value="/")
	public String isServerOn(){
		return "Server is On!!!";
	}
}

