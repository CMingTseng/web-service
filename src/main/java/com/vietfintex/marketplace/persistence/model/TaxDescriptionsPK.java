/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Dell
 */
@Embeddable
public class TaxDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "tax_id")
    private int taxId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public TaxDescriptionsPK() {
    }

    public TaxDescriptionsPK(int taxId, String langCode) {
        this.taxId = taxId;
        this.langCode = langCode;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) taxId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxDescriptionsPK)) {
            return false;
        }
        TaxDescriptionsPK other = (TaxDescriptionsPK) object;
        if (this.taxId != other.taxId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TaxDescriptionsPK[ taxId=" + taxId + ", langCode=" + langCode + " ]";
    }
    
}