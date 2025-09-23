package com.tnsif.PlacementManagement_College;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Tables")
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)


public class College 
{
		  
	    private Long id;
	    private String name;
	    private String location;
	    private String email;
	    private Long phoneNumber;
	    private Long establishedYear;
	    private Integer numberOfDepartments;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public Long getEstablishedYear() {
			return establishedYear;
		}
		public void setEstablishedYear(Long establishedYear) {
			this.establishedYear = establishedYear;
		}
		public Integer getNumberOfDepartments() {
			return numberOfDepartments;
		}
		public void setNumberOfDepartments(Integer numberOfDepartments) {
			this.numberOfDepartments = numberOfDepartments;
		}

}
