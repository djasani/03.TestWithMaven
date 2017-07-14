package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.RegistrationRepository;
import com.fanniemae.payroll.model.Registration;

public class DriverRegistrationRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrationRepository rr = new RegistrationRepository();
		Registration t = new Registration(1000, "Dharmesh", "Jasani", 36);
		//rr.insert(t );
		rr.delete(1000);

	}

}
