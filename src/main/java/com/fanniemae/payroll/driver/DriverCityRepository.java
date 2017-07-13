package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CountryRepository;

public class DriverCityRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountryRepository cr = new CountryRepository();
		//cr.findAll().forEach(System.out::println);
		cr.findAll().stream().filter(e->e.getPopulation() > 200_000_000).forEach(System.out::println);
		
		cr.findAll().st
	}

}
