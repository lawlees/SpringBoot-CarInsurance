package com.car.insurance.modelutils;

public class Basic implements Members {

	@Override
	public double computePrice(double basePrice) {
		// TODO Auto-generated method stub
		return 0.9*basePrice;
	}

	@Override
	public String getFacilities() {
		// TODO Auto-generated method stub
		return null;
	}

}
