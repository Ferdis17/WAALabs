package edu.mum.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.repository.IAdviceRepository;
import edu.mum.service.IAdviceService;

@Service
public class AdviceService implements IAdviceService {
	
	@Autowired
	private IAdviceRepository adviceRepo;

	@Override
	public List<String> getListByType(String roast) {
		
		return adviceRepo.getListByType(roast);
	}

	@Override
	public Map<Integer, String> getAllRoast() {
		
		return adviceRepo.getAllRoast();
	}

	@Override
	public String getRoast(Integer integer) {
		
		return adviceRepo.getRoast(integer);
	}

}
