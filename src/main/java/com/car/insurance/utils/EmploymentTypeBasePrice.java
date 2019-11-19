package com.car.insurance.utils;

import java.util.HashMap;
import java.util.Map;

public class EmploymentTypeBasePrice {
	
	private static final Map<String, Double> EMPLOYEE_BASE_PRICE = new HashMap<String, Double>();
	static {
		EMPLOYEE_BASE_PRICE.put("UNEMPLOYED", 150.000);
		EMPLOYEE_BASE_PRICE.put("LOWSALARY", 135.000);
		EMPLOYEE_BASE_PRICE.put("MEDIUMSALARY", 120.000);
		EMPLOYEE_BASE_PRICE.put("HIGHSALARY", 100.000);	
	}
	
	public static double getBasePrice(String employeeType) {
		return EMPLOYEE_BASE_PRICE.get(employeeType.toUpperCase());
	}
}
