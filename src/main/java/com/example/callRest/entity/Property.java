package com.example.callRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "properties")
public class Property extends BaseEntity{

	
	@Id
	@Column(name = "property_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long propertyId;

	@Column(name = "property_key")
	private String propertyKey;

	@Column(name = "property_value")
	private String propertyValue;

	public Long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}


	public String getPropertyKey() {
		return propertyKey;
	}

	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", propertyKey=" + propertyKey + ", propertyValue="
				+ propertyValue + "]";
	}

	
	
}
