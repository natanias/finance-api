package br.com.WebAPI.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_customer")
public class Customer {
	@Id //Says who is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Insert an id automatically
    private Long customerID;
    private Long addressID;
    private Long branchID;
    private String customerDetails;
    
    @ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
    
    @OneToMany(mappedBy = "customer") // Aponta o Adrress ID para customers | faz a chave estrangeira
    private List<Account> account = new ArrayList<>();
    
    public Customer(Long customerID, Long addressID, Long branchID, String customerDetails) {
        this.customerID = customerID;
        this.addressID = addressID;
        this.branchID = branchID;
        this.customerDetails = customerDetails;
    }
    
    //getters e setters
    public Long getCustomerID() {
        return customerID;
    }
    
    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }
    
    public Long getAddressID() {
        return addressID;
    }
    
    public void setAddressID(Long addressID) {
        this.addressID = addressID;
    }
    
    public Long getBranchID() {
        return branchID;
    }
    
    public void setBranchID(Long branchID) {
        this.branchID = branchID;
    }
    
    public String getCustomerDetails() {
        return customerDetails;
    }
    
    public void setCustomerDetails(String customerDetails) {
        this.customerDetails = customerDetails;
    }

	public Address getAddress() {
		return address;
	}

	public List<Account> getAccount() {
		return account;
	}
    
    
}

