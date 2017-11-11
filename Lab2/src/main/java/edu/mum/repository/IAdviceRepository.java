package edu.mum.repository;

import java.util.List;
import java.util.Map;

public interface IAdviceRepository {
	
	public List<String> getListByType(String roast);
	public Map<Integer,String> getAllRoast();
	public String getRoast(Integer integer);

}
