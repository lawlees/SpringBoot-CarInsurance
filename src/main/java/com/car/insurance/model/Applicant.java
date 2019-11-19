package com.car.insurance.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true) 
@JsonInclude(Include.NON_NULL) 
@Component
public class Applicant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Name name;
	
	@NotNull
	@Column(name = "date_of_birth")
	@JsonProperty("date_of_birth")
	private String dateOfBirth;
	
	@NotNull
	private String gender;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Address address;
	
	@NotNull
	@Column(name = "marital_status")
	@JsonProperty("marital_status")
	private String maritalStatus;
	
	@NotNull
	@Column(name = "home_ownership")
	@JsonProperty("home_ownership")
	private String homeOwnership;
	
	@NotNull
	@Column(name = "auto_insurance_history")
	@JsonProperty("auto_insurance_history")
	private String autoInsuranceHistory;
	
	@NotNull
	@Column(name = "level_of_education")
	@JsonProperty("level_of_education")
	private String levelOfEducation;
	
	@JsonProperty("employment")
	@OneToOne(cascade = {CascadeType.ALL})
	private Employment employment;
	
	@JsonProperty("contact")
	@OneToOne(cascade = {CascadeType.ALL})
	private Contact contact;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name="applicant_car_id")
	private List<Car> cars;
	
	@Column(name = "membership_type")
	@JsonProperty("membership_type")
	@NotNull
	private String membershipType;
	
	@Column(name = "new_accident")
	@JsonProperty("new_accident")
	@NotNull
	private String newAccident;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getHomeOwnership() {
		return homeOwnership;
	}

	public void setHomeOwnership(String homeOwnership) {
		this.homeOwnership = homeOwnership;
	}

	public String getAutoInsuranceHistory() {
		return autoInsuranceHistory;
	}

	public void setAutoInsuranceHistory(String autoInsuranceHistory) {
		this.autoInsuranceHistory = autoInsuranceHistory;
	}

	public String getLevelOfEducation() {
		return levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}

	public Employment getEmployment() {
		return employment;
	}

	public void setEmployment(Employment employment) {
		this.employment = employment;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	
}
