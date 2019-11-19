package com.car.insurance.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.car.insurance.model.Applicant;
import com.car.insurance.model.InsuranceScoreResponse;
import com.car.insurance.service.ApplicantService;

@RestController
@RequestMapping("/")
public class InsuranceScoreController {
	
	@Autowired
	private ApplicantService applicantSer;

	@RequestMapping(value="/insurance", method= {RequestMethod.POST,RequestMethod.PUT})
	public ResponseEntity<InsuranceScoreResponse> getInsuranceScore(@Valid @RequestBody Applicant applicant, BindingResult result) {

		return ResponseEntity.ok(applicantSer.getInsuranceScore(applicant));
	}
	

}
