/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "product_option")
@NamedQueries({
    @NamedQuery(name = "ProductOption.findAll", query = "SELECT p FROM ProductOption p")})
public class ProductOption implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "option_id")
    private Integer optionId;
    @Basic(optional = false)
    @Column(name = "store_id")
    private int storeId;
    @Basic(optional = false)
    @Column(name = "option_type")
    private Character optionType;
    @Column(name = "option_name")
    private String optionName;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @Column(name = "required")
    private Character required;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public ProductOption() {
    }

    public ProductOption(Integer optionId) {
        this.optionId = optionId;
    }

    public ProductOption(Integer optionId, int storeId, Character optionType, String comment, Character required, short position, String value, Character status) {
        this.optionId = optionId;
        this.storeId = storeId;
        this.optionType = optionType;
        this.comment = comment;
        this.required = required;
        this.position = position;
        this.value = value;
        this.status = status;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Character getOptionType() {
        return optionType;
    }

    public void setOptionType(Character optionType) {
        this.optionType = optionType;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Character getRequired() {
        return required;
    }

    public void setRequired(Character required) {
        this.required = required;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (optionId != null ? optionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOption)) {
            return false;
        }
        ProductOption other = (ProductOption) object;
        if ((this.optionId == null && other.optionId != null) || (this.optionId != null && !this.optionId.equals(other.optionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.ProductOption[ optionId=" + optionId + " ]";
    }
    
}
