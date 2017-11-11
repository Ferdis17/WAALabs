package edu.mum.repository.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.mum.database.Database;
import edu.mum.repository.IAdviceRepository;

@Repository
public class AdviceRepository implements IAdviceRepository{
	
	@Autowired
	private Database database;

	@Override
	public List<String> getListByType(String roast) {
		
		return database.getAdvice(roast);
	}

	@Override
	public Map<Integer, String> getAllRoast() {
		
		return database.roastMap;
	}

	@Override
	public String getRoast(Integer integer) {
		return database.roastMap.get(integer);
	}

}
