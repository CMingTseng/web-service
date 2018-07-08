/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "currency")
@NamedQueries({
    @NamedQuery(name = "Currency.findAll", query = "SELECT c FROM Currency c")})
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "currency_id")
    private Long currencyId;
    @Basic(optional = false)
    @Column(name = "currency_code")
    private String currencyCode;
    @Column(name = "symbol")
    private String symbol;
    @Basic(optional = false)
    @Column(name = "coefficient")
    private double coefficient;
    @Basic(optional = false)
    @Column(name = "is_primary")
    private String isPrimary;
    @Basic(optional = false)
    @Column(name = "position")
    private Long position;
    @Basic(optional = false)
    @Column(name = "decimals_separator")
    private String decimalsSeparator;
    @Basic(optional = false)
    @Column(name = "thousands_separator")
    private String thousandsSeparator;
    @Basic(optional = false)
    @Column(name = "decimals")
    private Long decimals;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public Currency() {
    }

    public Currency(Long currencyId) {
        this.currencyId = currencyId;
    }

    public Currency(Long currencyId, String currencyCode, double coefficient, String isPrimary, Long position, String decimalsSeparator, String thousandsSeparator, Long decimals, String status) {
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.coefficient = coefficient;
        this.isPrimary = isPrimary;
        this.position = position;
        this.decimalsSeparator = decimalsSeparator;
        this.thousandsSeparator = thousandsSeparator;
        this.decimals = decimals;
        this.status = status;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getDecimalsSeparator() {
        return decimalsSeparator;
    }

    public void setDecimalsSeparator(String decimalsSeparator) {
        this.decimalsSeparator = decimalsSeparator;
    }

    public String getThousandsSeparator() {
        return thousandsSeparator;
    }

    public void setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }

    public Long getDecimals() {
        return decimals;
    }

    public void setDecimals(Long decimals) {
        this.decimals = decimals;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (currencyId != null ? currencyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Currency)) {
            return false;
        }
        Currency other = (Currency) object;
        if ((this.currencyId == null && other.currencyId != null) || (this.currencyId != null && !this.currencyId.equals(other.currencyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.Currency[ currencyId=" + currencyId + " ]";
    }
    
}
