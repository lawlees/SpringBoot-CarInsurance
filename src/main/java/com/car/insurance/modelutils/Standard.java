package com.car.insurance.modelutils;

public class Standard implements Members {

	@Override
	public double computePrice(double basePrice) {
		// TODO Auto-generated method stub
		return 0.8*basePrice;
	}

	@Override
	public String getFacilities() {
		// TODO Auto-generated method stub
		return "50%";
	}

}
