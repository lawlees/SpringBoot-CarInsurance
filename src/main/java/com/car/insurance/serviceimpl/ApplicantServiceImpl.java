package com.car.insurance.serviceimpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.insurance.model.Applicant;
import com.car.insurance.model.InsuranceScoreResponse;
import com.car.insurance.model.OutputResponse;
import com.car.insurance.repository.CarInsuranceRepository;
import com.car.insurance.service.ApplicantService;
import com.car.insurance.utils.EmploymentTypeBasePrice;
import com.car.insurance.utils.MembershipTypeInstance;

@Service
public class ApplicantServiceImpl implements ApplicantService {

	
	@Autowired
	private CarInsuranceRepository carRepo;
	@Override
	public void saveOrUpdate(Applicant applicant) {
		Applicant existingApplicant = carRepo.findByName(applicant.getName().getFirstName(), applicant.getName().getLastName());
		if(Objects.isNull(existingApplicant)) {			
			carRepo.save(applicant);
		}else {
			//existingApplicant.setHomeOwnership(applicant.getHomeOwnership());
			carRepo.save(existingApplicant);
			//System.out.println("applicant exists" + applicant.getName().getFirstName());
		}
	}
	
	public OutputResponse getQuote(Applicant applicant) {
		OutputResponse op= new OutputResponse();
		op.setFirstName(applicant.getName().getFirstName());
		op.setLastName(applicant.getName().getLastName());
		op.setModel(applicant.getCars().get(0).getModel());
		double basePrice = EmploymentTypeBasePrice.getBasePrice(applicant.getEmployment().getOccupation());
		double finalPrice = MembershipTypeInstance.getMemberType(applicant.getMembershipType()).computePrice(basePrice);
		op.setPrice(finalPrice);
		op.setRoadsideAssistance(MembershipTypeInstance.getMemberType(applicant.getMembershipType()).getFacilities());
		return op;
	}

	@Override
	public InsuranceScoreResponse getInsuranceScore(Applicant applicant) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
