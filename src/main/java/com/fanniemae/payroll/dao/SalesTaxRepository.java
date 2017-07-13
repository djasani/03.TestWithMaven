package com.fanniemae.payroll.dao;

import java.util.ArrayList;

public class SalesTaxRepository implements IQuery<String> {

	@Override
	public ArrayList<String> findAll() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("NY:8.25%");
		list.add("FL:6.24%");
		list.add("CT:5.25%");
		list.add("VA:6.25%");
		return list;
	}

}
