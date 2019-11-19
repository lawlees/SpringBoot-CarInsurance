package com.car.insurance.utils;

import com.car.insurance.scoreutils.Excellent;

public class InsuranceScoreCalculator {
	public static Integer calculateScore(Integer oldScore) {
		return new Excellent().getNewScore(oldScore);
	}
	
	public static String deriveStatus(Integer score) {
		return new Excellent().getStatus(score);
	}
}
