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
@Table(name = "tb_refAccountType")
public class RefAccountType {
	@Id //Says who is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Insert an id automatically
    private Long accountTypeCode;
    private String accountTypeDescription;
    private boolean egBusiness;
    private boolean egChecking;
    private boolean personal;
    private boolean savings;
    
    @OneToMany(mappedBy = "refAccountType") // Aponta o Adrress ID para customers | faz a chave estrangeira
    private List<Account> account = new ArrayList<>();

	public RefAccountType(Long accountTypeCode, String accountTypeDescription, boolean egBusiness, boolean egChecking, boolean personal, boolean savings) {
        this.accountTypeCode = accountTypeCode;
        this.accountTypeDescription = accountTypeDescription;
        this.egBusiness = egBusiness;
        this.egChecking = egChecking;
        this.personal = personal;
        this.savings = savings;
    }
    
    //getters e setters
    public Long getAccountTypeCode() {
        return accountTypeCode;
    }
    
    public void setAccountTypeCode(Long accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }
    
    public String getAccountTypeDescription() {
        return accountTypeDescription;
    }
    
    public void setAccountTypeDescription(String accountTypeDescription) {
        this.accountTypeDescription = accountTypeDescription;
    }
    
    public boolean isEgBusiness() {
        return egBusiness;
    }
    
    public void setEgBusiness(boolean egBusiness) {
        this.egBusiness = egBusiness;
    }
    
    public boolean isEgChecking() {
        return egChecking;
    }
    
    public void setEgChecking(boolean egChecking) {
        this.egChecking = egChecking;
    }
    
    public boolean isPersonal() {
        return personal;
    }
    
    public void setPersonal(boolean personal) {
        this.personal = personal;
    }
    
    public boolean isSavings() {
        return savings;
    }
    
    public void setSavings(boolean savings) {
        this.savings = savings;
    }

	public List<Account> getAccount() {
		return account;
	}
    
    
}
