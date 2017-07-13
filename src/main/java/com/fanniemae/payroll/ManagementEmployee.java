package com.fanniemae.payroll;

public class ManagementEmployee extends Employee {

	float hoursWorked = 40f;
	
	
	public ManagementEmployee(float yearlySalary) {
		super(yearlySalary);
	}
	
	public ManagementEmployee(float yearlySalary, float hw){
		super(yearlySalary);
		this.hoursWorked = hw;	
	}

	@Override
	public float getOverTimeHourlyWage() {
		float otHourlyWage = 0f;
		if (hoursWorked < 50) {
			otHourlyWage = 0f;
		} else if (hoursWorked < 60){
			otHourlyWage = 1000 / (hoursWorked - 40);
		} else if (hoursWorked < 80) {
			otHourlyWage = 2000 / (hoursWorked - 40);
		} else {
			otHourlyWage = 4000 / (hoursWorked -40);
		}
		return otHourlyWage;
	}

	@Override
	public float getWeeklySalary() {
		float weeklySalary = super.getWeeklySalary();
		if (hoursWorked < 50){
			weeklySalary = super.getWeeklySalary();
		} else if (hoursWorked < 60){
			weeklySalary = super.getWeeklySalary() + 1000;
		} else if (hoursWorked <80) {
			weeklySalary = super.getWeeklySalary() + 2000;
		} else {
			weeklySalary = super.getWeeklySalary() + 4000;
		}
		return weeklySalary;
	}
	
}
