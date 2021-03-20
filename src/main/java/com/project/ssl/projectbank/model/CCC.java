package com.project.ssl.projectbank.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CCC implements Serializable {


    private Integer entity;


    private Integer office;


    private Integer controlDigit;


    private Long account;

    public CCC(){

    }
    
    public CCC(Integer entity, Integer office, Integer controlDigit, Long account) {
		this.entity = entity;
		this.office = office;
		this.controlDigit = controlDigit;
		this.account = account;
	}


    
	public Integer getEntity() {
        return entity;
    }

    public void setEntity(Integer entity) {
        this.entity = entity;
    }

    public Integer getOffice() {
        return office;
    }

    public void setOffice(Integer office) {
        this.office = office;
    }

    public Integer getControlDigit() {
        return controlDigit;
    }

    public void setControlDigit(Integer controlDigit) {
        this.controlDigit = controlDigit;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }
    
    public static CCC extraerCCC(Long ccc) {
		String cccTexto=ccc.toString();
		Integer entity=Integer.parseInt(cccTexto.substring(0, 3));
		Integer office=Integer.parseInt(cccTexto.substring(4, 7));
		Integer controlDigit=Integer.parseInt(cccTexto.substring(8, 9));
		Long account=Long.parseLong(cccTexto.substring(10, 19));		
    	return new CCC(entity,office,controlDigit,account);
    }
    
    
}
