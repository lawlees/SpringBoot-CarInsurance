package com.car.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(Include.NON_NULL) //to include only non null values during response/output
@Component
@JsonPropertyOrder({"firstName", "lastName","model", "price" })
public class OutputResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "first_name")
	@JsonProperty("first")
	private String firstName;
	
	@Column(name = "last_name")
	@JsonProperty("last")
	private String lastName;
	
	private String model;
	
	private Double price;
	

	
	@Column(name = "roadside_assistance")
	@JsonProperty("roadside_assistance")
	private String roadsideAssistance;

	public Long getId() {
		return id;
	}

	public String getRoadsideAssistance() {
		return roadsideAssistance;
	}

	public void setRoadsideAssistance(String roadsideAssistance) {
		this.roadsideAssistance = roadsideAssistance;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
