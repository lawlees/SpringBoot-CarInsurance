package com.car.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.car.insurance.model.Applicant;


@Repository
public interface CarInsuranceRepository extends JpaRepository<Applicant, Long> {
	
	@Query("SELECT a FROM Applicant a WHERE a.name.firstName = :first_name and a.name.lastName = :last_name")
	public Applicant findByName(@Param("first_name") String firstName, @Param("last_name") String lastName);		
}
