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
public class TemplateTableColumnDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "column_id")
    private int columnId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public TemplateTableColumnDescriptionsPK() {
    }

    public TemplateTableColumnDescriptionsPK(int columnId, String langCode) {
        this.columnId = columnId;
        this.langCode = langCode;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
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
        hash += (int) columnId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateTableColumnDescriptionsPK)) {
            return false;
        }
        TemplateTableColumnDescriptionsPK other = (TemplateTableColumnDescriptionsPK) object;
        if (this.columnId != other.columnId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateTableColumnDescriptionsPK[ columnId=" + columnId + ", langCode=" + langCode + " ]";
    }
    
}