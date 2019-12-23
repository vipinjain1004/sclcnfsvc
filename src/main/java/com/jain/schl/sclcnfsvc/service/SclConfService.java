package com.jain.schl.sclcnfsvc.service;

import com.jain.schl.sclcnfsvc.exception.SclConfNotFoundException;
import com.jain.schl.sclcnfsvc.model.SclConfModel;

public interface SclConfService {
	public SclConfModel findById(Long id) throws SclConfNotFoundException;

	public SclConfModel findByAttKey(String key)throws SclConfNotFoundException;

	
}
