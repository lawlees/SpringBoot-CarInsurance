package com.car.insurance.scoreutils;

public interface InsuranceScore {
	public Integer getNewScore(Integer oldScore);
	public String getStatus(Integer score);
}
