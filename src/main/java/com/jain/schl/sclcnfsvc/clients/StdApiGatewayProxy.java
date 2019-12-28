package com.jain.schl.sclcnfsvc.clients;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.jain.schl.sclcnfsvc.exception.SclConfNotFoundException;
import com.jain.schl.sclcnfsvc.model.SclConfModel;

//@FeignClient(name="school-netflix-zuul-service")
//@RibbonClient(name="school-student-service")
public interface StdApiGatewayProxy {
	
}
