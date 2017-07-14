package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CityRepository;
import com.fanniemae.payroll.model.City;

public class DriverCityRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CityRepository ct = new CityRepository();
		//ct.findAll().forEach(System.out::println);
		//ct.findAll().stream().filter(e->e.getPopulation() > 200_000_000).forEach(System.out::println);
		
		City city = ct.findByKey("100");
		
		System.out.println(city);
		
		}

}
