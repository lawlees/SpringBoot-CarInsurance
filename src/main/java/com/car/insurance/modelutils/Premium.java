package com.car.insurance.modelutils;

public class Premium implements Members {

	@Override
	public double computePrice(double basePrice) {
		// TODO Auto-generated method stub
		return 0.7*basePrice;
	}

	@Override
	public String getFacilities() {
		// TODO Auto-generated method stub
		return "100%";
	}

}
