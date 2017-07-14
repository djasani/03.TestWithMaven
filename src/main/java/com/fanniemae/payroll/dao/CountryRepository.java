package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fanniemae.payroll.model.Country;

public class CountryRepository extends AbstractSQLDAO implements IQuery<Country> {

	ArrayList<Country> list = new ArrayList<>();

	@Override
	protected void results(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		String name = rs.getString("name");
		String code = rs.getString("code");
		int population = rs.getInt("population");
		list.add(new Country(code, name, population));


	}

	@Override
	public ArrayList<Country> findAll() {
		// TODO Auto-generated method stub
		String sql = "Select code, name, population from country";
		super.process(sql);
		return list;

	}

	@Override
	public Country findByKey(String key) {
		// TODO Auto-generated method stub
		String sql = "Select code, name, population from country where code = '" + key +"'";
		System.out.println(sql);
		super.process(sql);
		Country country = list.get(0);
		return country;
	}
	
	

}
