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
public class ProductFileDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "file_id")
    private int fileId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public ProductFileDescriptionsPK() {
    }

    public ProductFileDescriptionsPK(int fileId, String langCode) {
        this.fileId = fileId;
        this.langCode = langCode;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
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
        hash += (int) fileId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFileDescriptionsPK)) {
            return false;
        }
        ProductFileDescriptionsPK other = (ProductFileDescriptionsPK) object;
        if (this.fileId != other.fileId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFileDescriptionsPK[ fileId=" + fileId + ", langCode=" + langCode + " ]";
    }
    
}
