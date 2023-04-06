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
@Table(name = "tb_refTransactionType")
public class RefTransactionType {
	@Id //Says who is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Insert an id automatically
    private Long transactionTypeCode;
    private String transactionTypeDescription;
    private boolean egCredit;
    private boolean egDebit;
    private boolean payment;
    
    @OneToMany(mappedBy = "refTransactionType") // Aponta o Adrress ID para customers | faz a chave estrangeira
    private List<Transaction> transaction = new ArrayList<>();

    
    public RefTransactionType(Long transactionTypeCode, String transactionTypeDescription, boolean egCredit, boolean egDebit, boolean payment) {
        this.transactionTypeCode = transactionTypeCode;
        this.transactionTypeDescription = transactionTypeDescription;
        this.egCredit = egCredit;
        this.egDebit = egDebit;
        this.payment = payment;
    }
    
    //getters e setters
    public Long getTransactionTypeCode() {
        return transactionTypeCode;
    }
    
    public void setTransactionTypeCode(Long transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }
    
    public String getTransactionTypeDescription() {
        return transactionTypeDescription;
    }
    
    public void setTransactionTypeDescription(String transactionTypeDescription) {
        this.transactionTypeDescription = transactionTypeDescription;
    }
    
    public boolean isEgCredit() {
        return egCredit;
    }
    
    public void setEgCredit(boolean egCredit) {
        this.egCredit = egCredit;
    }
    
    public boolean isEgDebit() {
        return egDebit;
    }
    
    public void setEgDebit(boolean egDebit) {
        this.egDebit = egDebit;
    }
    
    public boolean isPayment() {
        return payment;
    }
    
    public void setPayment(boolean payment) {
        this.payment = payment;
    }

	public List<Transaction> getTransaction() {
		return transaction;
	}
    
}
