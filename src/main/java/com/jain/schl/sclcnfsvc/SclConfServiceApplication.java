package com.jain.schl.sclcnfsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@PropertySource(ignoreResourceNotFound= false,  value="file:/D:/SchoolManagement/application.properties")
@EnableJpaAuditing
@EnableDiscoveryClient
@RefreshScope
@RestController
public class SclConfServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SclConfServiceApplication.class, args);
	}
}
