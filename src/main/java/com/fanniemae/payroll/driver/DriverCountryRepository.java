package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CityRepository;

public class DriverCountryRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CityRepository cr = new CityRepository();
		cr.findAll().forEach(System.out::println);
	}

}
