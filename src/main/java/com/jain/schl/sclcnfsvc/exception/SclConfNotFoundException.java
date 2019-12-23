package com.jain.schl.sclcnfsvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class SclConfNotFoundException  extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SclConfNotFoundException(String message){
		super(message);
	}

}
