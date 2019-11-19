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
import com.car.insurance.model.OutputResponse;
import com.car.insurance.service.ApplicantService;

@RestController
@RequestMapping("/")
public class CarInsuranceController {

	@Autowired
	private ApplicantService applicantSer;

	@RequestMapping(value = "/applicant", method = RequestMethod.POST)
	public ResponseEntity<OutputResponse> getQuote(@Valid @RequestBody Applicant applicant, BindingResult result) {

		applicantSer.saveOrUpdate(applicant);
		return ResponseEntity.ok(applicantSer.getQuote(applicant));
	}

}
