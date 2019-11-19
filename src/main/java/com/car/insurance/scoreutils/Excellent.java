package com.car.insurance.scoreutils;

public class Excellent implements InsuranceScore {

	@Override
	public Integer getNewScore(Integer oldScore) {
			return oldScore>=650?oldScore-10:(new Good()).getNewScore(oldScore);
	}

	@Override
	public String getStatus(Integer score) {
		// TODO Auto-generated method stub
		return score>=650?"Excellent":(new Good().getStatus(score));
	}
}
