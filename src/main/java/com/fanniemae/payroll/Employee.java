package com.fanniemae.payroll;

public abstract class Employee {
	
	private float yearlySalary = 0;
	
	public Employee(float yearlySalary){
		this.yearlySalary = yearlySalary;
	}
	
	public float getYearlySalary(){
		return this.yearlySalary;
	}
	
	public float getWeeklySalary(){
		return yearlySalary / 52;
	}

	
	public float getMonthlySalary(){
		return yearlySalary / 12;
	}
	
	public float getHourlyWage(){
		return yearlySalary / 52/ 40;
	}
	
	public float getOverTimeHourlyWage(){
		return 0;
	}
}
