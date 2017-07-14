package com.fanniemae.payroll.driver;

public class DriverThread {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println("Loop 2 - " + i);
				}
			}
		};
		
		t.start();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Loop 1 - " + i);
		}
	}

}
