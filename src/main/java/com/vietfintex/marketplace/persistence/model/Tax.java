/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "tax")
public class Tax implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tax_id")
    private Long taxId;
    @Basic(optional = false)
    @Column(name = "tax")
    private String tax;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "rate_value")
    private BigDecimal rateValue;
    @Basic(optional = false)
    @Column(name = "rate_type")
    private Character rateType;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "price_includes_tax")
    private Character priceIncludesTax;
    @Basic(optional = false)
    @Column(name = "display_including_tax")
    private Character displayIncludingTax;
    @Basic(optional = false)
    @Column(name = "display_info")
    private Character displayInfo;
    @Basic(optional = false)
    @Column(name = "regnumber")
    private String regnumber;
    @Basic(optional = false)
    @Column(name = "priority")
    private Long priority;

    public Tax() {
    }

    public Tax(Long taxId) {
        this.taxId = taxId;
    }

    public Tax(Long taxId, String tax, BigDecimal rateValue, Character rateType, Character status, Character priceIncludesTax, Character displayIncludingTax, Character displayInfo, String regnumber, Long priority) {
        this.taxId = taxId;
        this.tax = tax;
        this.rateValue = rateValue;
        this.rateType = rateType;
        this.status = status;
        this.priceIncludesTax = priceIncludesTax;
        this.displayIncludingTax = displayIncludingTax;
        this.displayInfo = displayInfo;
        this.regnumber = regnumber;
        this.priority = priority;
    }

    public Long getTaxId() {
        return taxId;
    }

    public void setTaxId(Long taxId) {
        this.taxId = taxId;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public BigDecimal getRateValue() {
        return rateValue;
    }

    public void setRateValue(BigDecimal rateValue) {
        this.rateValue = rateValue;
    }

    public Character getRateType() {
        return rateType;
    }

    public void setRateType(Character rateType) {
        this.rateType = rateType;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getPriceIncludesTax() {
        return priceIncludesTax;
    }

    public void setPriceIncludesTax(Character priceIncludesTax) {
        this.priceIncludesTax = priceIncludesTax;
    }

    public Character getDisplayIncludingTax() {
        return displayIncludingTax;
    }

    public void setDisplayIncludingTax(Character displayIncludingTax) {
        this.displayIncludingTax = displayIncludingTax;
    }

    public Character getDisplayInfo() {
        return displayInfo;
    }

    public void setDisplayInfo(Character displayInfo) {
        this.displayInfo = displayInfo;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxId != null ? taxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tax)) {
            return false;
        }
        Tax other = (Tax) object;
        if ((this.taxId == null && other.taxId != null) || (this.taxId != null && !this.taxId.equals(other.taxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.Tax[ taxId=" + taxId + " ]";
    }
    
}
