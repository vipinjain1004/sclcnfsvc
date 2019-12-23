package com.jain.schl.sclcnfsvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jain.schl.sclcnfsvc.model.SclConfModel;


@Repository
public interface SclConfRepo extends JpaRepository<SclConfModel, Long> {

	public List<SclConfModel> findByAttKey(String key);
	
	
}

