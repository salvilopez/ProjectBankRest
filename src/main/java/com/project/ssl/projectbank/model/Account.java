package com.project.ssl.projectbank.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Account{
	
	
	@EmbeddedId
    @NotNull
    private CCC ccc;

    @Size(min = 3, max = 3)
    private String coinBase;

    private Boolean situacion;


    private Double disponible;


    public Account(@Size(min = 4, max = 4) Integer entity, @Size(min = 4, max = 4) Integer office, @Size(min = 2, max = 2) Integer controlDigit, @Size(min = 10, max = 10) Long account, @NotNull @Size(min = 10, max = 10) CCC ccc, @Size(min = 3, max = 3) String coinBase, Boolean situacion, Double disponible) {
        this.ccc = ccc;
        this.coinBase = coinBase;
        this.situacion = situacion;
        this.disponible = disponible;
    }

    public Account() {
        super();
    }

    public CCC getCcc() {
        return ccc;
    }

    public void setCcc(CCC ccc) {
        this.ccc = ccc;
    }

    public String getCoinBase() {
        return coinBase;
    }

    public void setCoinBase(String coinBase) {
        this.coinBase = coinBase;
    }

    public Boolean getSituacion() {
        return situacion;
    }

    public void setSituacion(Boolean situacion) {
        this.situacion = situacion;
    }

    public Double getDisponible() {
        return disponible;
    }

    public void setDisponible(Double disponible) {
        this.disponible = disponible;
    }
}
