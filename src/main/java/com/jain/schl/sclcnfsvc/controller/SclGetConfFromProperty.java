package com.jain.schl.sclcnfsvc.controller;

import org.hibernate.validator.internal.metadata.raw.BeanConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jain.schl.sclcnfsvc.conf.Configuration;

@RestController
public class SclGetConfFromProperty {
	
	
	private static Logger LOGGER = LoggerFactory.getLogger(SclGetConfFromProperty.class);
	
	@Value("${confservice.profile}")
	String profile;
	
	@Autowired
	Configuration conf;
	
	 @GetMapping("/confservice")
	 public BeanConfiguration<Configuration> getConfiguracionRefrescada()
	    { 
		 LOGGER.info("Profile :: ====> {}", conf.getProfile());
		 
		 LOGGER.info("Profile :: ====> {}", profile);
		 
		 return null;
		 
	    }
	
	
}
