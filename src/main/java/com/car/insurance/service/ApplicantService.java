package com.car.insurance.service;

import com.car.insurance.model.Applicant;
import com.car.insurance.model.InsuranceScoreResponse;
import com.car.insurance.model.OutputResponse;

public interface ApplicantService {

	public void saveOrUpdate(Applicant applicant);
	public OutputResponse getQuote(Applicant applicant);
	public InsuranceScoreResponse getInsuranceScore(Applicant applicant);
}
