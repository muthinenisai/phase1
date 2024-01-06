package com.ecommerce.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long ID;
	
	@Size(min = 3, max=10, message="User name should min 3 chars and max 10 chars")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	AadharCard aadharCard;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)	
	List<MobilePhone> phones;
	
	@ManyToMany(mappedBy = "users", cascade = CascadeType.ALL)
	List<EducationalDegree> degrees;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AadharCard getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}	
	
	public void setPhones(List<MobilePhone> phones) {
		this.phones = phones;
	}
	
	public List<MobilePhone> getPhones() {
		return phones;
	}

	public List<EducationalDegree> getDegrees() {
		return degrees;
	}

	public void setDegrees(List<EducationalDegree> degrees) {
		this.degrees = degrees;
	}
	
 
	
}
