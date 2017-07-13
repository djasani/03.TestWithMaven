package com.fanniemae.payroll.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DriverMap {
	/* the objective of this topic
	 * is to discuss the relationship 
	 * between the Map interface and HashMap implementation
	 * Author : Dharmesh Jasani
	 * Modified 03/13/2017 Thursday
	 */
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		
		map.put("David", 1_000_000d);
		map.put("Lucy", 2_000_000d);
		map.put("Peter", 3_000_000d);

		System.out.println(map.get("David"));
		System.out.println(map.size());
		
		Set<String> keys = map.keySet();
		for (String string : keys) {
			System.out.println(string.toUpperCase());
		}
	}

}
