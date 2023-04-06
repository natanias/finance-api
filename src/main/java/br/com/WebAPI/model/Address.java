package br.com.WebAPI.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_address")
public class Address {
	@Id //Says who is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Insert an id automatically
	private Long addressID;
    private String line1;
    private String line2;
    private String townCity;
    private String zipPostCode;
    private String stateProvinceCounty;
    private String country;
    private String otherDetails;
    
    @OneToMany(mappedBy = "address") // Aponta o Adrress ID para customers | faz a chave estrangeira
    private List<Customer> customers = new ArrayList<>();
    
	public Address(Long addressID, String line1, String line2, String townCity, String zipPostCode, String stateProvinceCounty, String country, String otherDetails) {
        this.addressID = addressID;
    	this.line1 = line1;
        this.line2 = line2;
        this.townCity = townCity;
        this.zipPostCode = zipPostCode;
        this.stateProvinceCounty = stateProvinceCounty;
        this.country = country;
        this.otherDetails = otherDetails;
    }
  //getters e setters
    public Long getAddressID() {
		return addressID;
	}

	public void setAddressID(Long addressID) {
		this.addressID = addressID;
	}

    public String getLine1() {
        return line1;
    }
    
    public void setLine1(String line1) {
        this.line1 = line1;
    }
    
    public String getLine2() {
        return line2;
    }
    
    public void setLine2(String line2) {
        this.line2 = line2;
    }
    
    public String getTownCity() {
        return townCity;
    }
    
    public void setTownCity(String townCity) {
        this.townCity = townCity;
    }
    
    public String getZipPostCode() {
        return zipPostCode;
    }
    
    public void setZipPostCode(String zipPostCode) {
        this.zipPostCode = zipPostCode;
    }
    
    public String getStateProvinceCounty() {
        return stateProvinceCounty;
    }
    
    public void setStateProvinceCounty(String stateProvinceCounty) {
        this.stateProvinceCounty = stateProvinceCounty;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getOtherDetails() {
        return otherDetails;
    }
    
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
    
    public List<Customer> getCustomers() {
		return customers;
	}
}
