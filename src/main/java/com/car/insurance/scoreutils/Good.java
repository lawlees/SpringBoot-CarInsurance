package com.car.insurance.scoreutils;

public class Good implements InsuranceScore{

	@Override
	public Integer getNewScore(Integer oldScore) {
		return oldScore>=450?oldScore-20:(new Bad()).getNewScore(oldScore);
	}

	@Override
	public String getStatus(Integer score) {
		// TODO Auto-generated method stub
		return score>=450?"Excellent":(new Good().getStatus(score));
	}

}
