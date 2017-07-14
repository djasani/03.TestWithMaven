package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CountryRepository;

public class DriverCountryRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountryRepository cr = new CountryRepository();
		//cr.findAll().forEach(System.out::println);
		
		System.out.println(cr.findByKey("USA"));
	}

}
