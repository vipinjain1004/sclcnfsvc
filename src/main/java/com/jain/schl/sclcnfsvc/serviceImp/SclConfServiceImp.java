package com.jain.schl.sclcnfsvc.serviceImp;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.jain.schl.sclcnfsvc.exception.SclConfNotFoundException;
import com.jain.schl.sclcnfsvc.model.SclConfModel;
import com.jain.schl.sclcnfsvc.repo.SclConfRepo;
import com.jain.schl.sclcnfsvc.service.SclConfService;

@Service
public class SclConfServiceImp implements SclConfService {

	@Autowired
	private SclConfRepo confRepo;

	private static Logger LOGGER = LoggerFactory.getLogger(SclConfServiceImp.class);

	public SclConfModel findById(Long id) throws SclConfNotFoundException {
		Optional<SclConfModel> scOptional = confRepo.findById(id);
		if (scOptional.isPresent()) {
			return scOptional.get();
		} else {
			throw new SclConfNotFoundException("Configrution not found for : " + id);
		}
	}

	public SclConfModel findByAttKey(String key) throws SclConfNotFoundException {
		List<SclConfModel> scList = confRepo.findByAttKey(key);
		if (!CollectionUtils.isEmpty(scList)) {
			return scList.get(0);
		} else {
			LOGGER.info("Configrution not found for : {}", key);
			throw new SclConfNotFoundException("Configrution not found for : " + key);
		}
	}
}
