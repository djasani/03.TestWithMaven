package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarRepository implements IQuery<String> {

	@Override
	public ArrayList<String> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Double> findMaps() {		
		Map<String, Double> map = new HashMap<>();
		
		map.put("Hundai", 15_000d);
		map.put("Toyota", 20_000d);
		map.put("Honda", 30_000d);
		map.put("Lexus", 50_000d);
		map.put("BMW", 60_000d);
		map.put("Audi", 70_000d);
		map.put("Jaguar", 80_000d);
		map.put("Tesla", 100_000d);
		map.put("Bentley", 180_000d);
		map.put("Ferrari", 350_000d);
		
		return map;
	}

}
