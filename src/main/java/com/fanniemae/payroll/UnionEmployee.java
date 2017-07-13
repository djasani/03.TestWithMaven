package com.fanniemae.payroll;

public class UnionEmployee extends Employee {
	
	float hoursWorked = 40f;

	public UnionEmployee(float yearlySalary) {
		super(yearlySalary);
	}
	

	public UnionEmployee(float yearlySalary, float hoursWorked){
		super(yearlySalary);
		this.hoursWorked = hoursWorked;
	}
	
	//code = new, code=season
	public UnionEmployee(String code, float yearlySalary, float hoursWorked) throws Exception{
		super(yearlySalary);
		this.hoursWorked = hoursWorked;
		
		if (hoursWorked > 40 && code.equals("new")){
			//throw new Exception();
			Exception e = new Exception();
			throw e;
		}
	}
	
	@Override
	public String toString(){
		return "I am an employee that makes " + this.getYearlySalary() 
					+ " year";
	}
	
	
	
	
	@Override
	public float getOverTimeHourlyWage() {
		return super.getHourlyWage() * 1.5f ;
	}


	@Override
	public float getWeeklySalary(){
		float otHours = 0;
		float otPay = 0;
		float weeklySalary;
		
		if (hoursWorked > 40){
			otHours = hoursWorked - 40;
			otPay = otHours * this.getOverTimeHourlyWage();
			weeklySalary = super.getHourlyWage() * 40 + otPay;
		} else {
			weeklySalary = super.getHourlyWage() * this.hoursWorked;
		}
		
		return weeklySalary;
	}

}
