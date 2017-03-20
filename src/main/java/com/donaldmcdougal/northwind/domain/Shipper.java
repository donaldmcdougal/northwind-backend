/**
 * 
 */
package com.donaldmcdougal.northwind.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Donald McDougal
 *
 */
@Entity
@Table(name = "shippers")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Shipper {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@Size(max = 50)
	private String company;

	@Size(max = 50)
	@Column(name = "last_name")
	private String lastName;

	@Size(max = 50)
	@Column(name = "first_name")
	private String firstName;

	@Size(max = 50)
	@Column(name = "email_address")
	private String emailAddress;

	@Size(max = 50)
	@Column(name = "job_title")
	private String jobTitle;

	@Size(max = 25)
	@Column(name = "business_phone")
	private String businessPhone;

	@Size(max = 25)
	@Column(name = "home_phone")
	private String homePhone;

	@Size(max = 25)
	@Column(name = "mobile_phone")
	private String mobilePhone;

	@Size(max = 25)
	@Column(name = "fax_number")
	private String faxNumber;
	
	private String address;

	@Size(max = 50)
	private String city;

	@Size(max = 50)
	@Column(name = "state_province")
	private String stateProvince;

	@Size(max = 15)
	@Column(name = "zip_postal_code")
	private String zipPostalCode;

	@Size(max = 50)
	@Column(name = "country_region")
	private String countryRegion;
	
	@Column(name = "web_page")
	private String webPage;
	
	private String notes;
	
	private byte[] attachments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getBusinessPhone() {
		return businessPhone;
	}

	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getZipPostalCode() {
		return zipPostalCode;
	}

	public void setZipPostalCode(String zipPostalCode) {
		this.zipPostalCode = zipPostalCode;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	public String getWebPage() {
		return webPage;
	}

	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public byte[] getAttachments() {
		return attachments;
	}

	public void setAttachments(byte[] attachments) {
		this.attachments = attachments;
	}
}
