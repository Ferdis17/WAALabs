package edu.mum.service;

import java.util.List;
import java.util.Map;

public interface IAdviceService {
	
	public List<String> getListByType(String roast);
	public Map<Integer,String> getAllRoast();
	public String getRoast(Integer integer);

}
