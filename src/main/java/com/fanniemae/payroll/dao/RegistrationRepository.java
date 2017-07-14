package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.fanniemae.payroll.model.Registration;

public class RegistrationRepository extends AbstractSQLDAO implements IModify<Registration, Integer> {

	@Override
	protected void results(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(Registration t) {
		// TODO Auto-generated method stub
		int id = t.getId();
		String firstName = t.getFirstName();
		String lastName = t.getLastName();
		int age = t.getAge();
		
		String sqlStatement = "Insert Into Registration " +
								" Values (" + id + ", '" + firstName + "', '" + lastName + "', " + age + ")";
		
		super.modify(sqlStatement);
		
	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		String sqlStatement = "Delete From Registration Where ID =" + key;
		super.modify(sqlStatement);
	}
	
	

}
