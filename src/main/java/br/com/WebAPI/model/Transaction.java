package br.com.WebAPI.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity  //says it is an entity
@Table(name = "tb_transaction") //create the entity in the database
public class Transaction {
	@Id //Says who is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Insert an id automatically
	private Long transactionID;
    private Long accountID;
    private Long transactionTypeCode;
    private LocalDateTime transactionDateTime;
    private double transactionAmount;
    private String otherDetails;
    
    @ManyToOne
   	@JoinColumn(name = "account_id")
   	private Account account;
    
    @ManyToOne
   	@JoinColumn(name = "refTransactionType_id")
   	private RefTransactionType refTransactionType;

	public Transaction(Long transactionID, Long accountID, Long transactionTypeCode, LocalDateTime transactionDateTime, double transactionAmount, String otherDetails) {
        this.transactionID = transactionID;
        this.accountID = accountID;
        this.transactionTypeCode = transactionTypeCode;
        this.transactionDateTime = transactionDateTime;
        this.transactionAmount = transactionAmount;
        this.otherDetails = otherDetails;
    }
    
    //getters e setters
    public Long getTransactionID() {
        return transactionID;
    }
    
    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }
    
    public Long getAccountID() {
        return accountID;
    }
    
    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }
    
    public Long getTransactionTypeCode() {
        return transactionTypeCode;
    }
    
    public void setTransactionTypeCode(Long transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }
    
    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }
    
    public void setTransactionDateTime(LocalDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }
    
    public double getTransactionAmount() {
        return transactionAmount;
    }
    
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    
    public String getOtherDetails() {
        return otherDetails;
    }
    
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
    
    public Account getAccount() {
		return account;
	}
}
