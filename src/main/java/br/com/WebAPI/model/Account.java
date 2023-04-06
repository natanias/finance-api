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
@Table(name = "tb_account")
public class Account {
	@Id //Says who is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Insert an id automatically
    private Long accountID;
    private String accountTypeCode;
    private Long customerID;
    private double balance;
    private String otherDetails;
    
    @ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
    
    @ManyToOne
	@JoinColumn(name = "refAccountType_id")
	private RefAccountType refAccountType;
    
    @OneToMany(mappedBy = "account") // Aponta o Adrress ID para customers | faz a chave estrangeira
    private List<Transaction> transaction = new ArrayList<>();

	public Account(Long accountID, String accountTypeCode, Long customerID, double balance, String otherDetails) {
        this.accountID = accountID;
        this.accountTypeCode = accountTypeCode;
        this.customerID = customerID;
        this.balance = balance;
        this.otherDetails = otherDetails;
    }
    
    //getters e setters
    public Long getAccountID() {
        return accountID;
    }
    
    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }
    
    public String getAccountTypeCode() {
        return accountTypeCode;
    }
    
    public void setAccountTypeCode(String accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }
    
    public Long getCustomerID() {
        return customerID;
    }
    
    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getOtherDetails() {
        return otherDetails;
    }
    
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

	public Customer getCustomer() {
		return customer;
	}

	public RefAccountType getRefAccountType() {
		return refAccountType;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}
	
}

