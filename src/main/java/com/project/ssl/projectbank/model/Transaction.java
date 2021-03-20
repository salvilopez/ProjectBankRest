package com.project.ssl.projectbank.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {


    @Id
    private Long id;

    private Double amount;

    private String concept;

    @ManyToOne
    private Account sourceAccount;

    @ManyToOne
    private Account destinationAccount;


    public Transaction() {
    }

    public Transaction(Long id, Double amount, String concept, Account sourceAccount, Account destinationAccount) {
        this.id = id;
        this.amount = amount;
        this.concept = concept;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
}
