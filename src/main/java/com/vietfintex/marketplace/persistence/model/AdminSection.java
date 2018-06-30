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
@Table(name = "admin_section")
@NamedQueries({
    @NamedQuery(name = "AdminSection.findAll", query = "SELECT a FROM AdminSection a")})
public class AdminSection implements Serializable {

    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "admin_section_id")
    private Long adminSectionId;
    @Basic(optional = false)
    @Column(name = "admin_section_parent_id")
    private Long adminSectionParentId;
    @Column(name = "section_key")
    private String sectionKey;
    @Column(name = "url")
    private String url;
    @Lob
    @Column(name = "icon")
    private String icon;
    @Lob
    @Column(name = "section_description")
    private String sectionDescription;
    @Column(name = "section_order")
    private Integer sectionOrder;
    @Column(name = "status")
    private String status;

    public AdminSection() {
    }

    public AdminSection(Long adminSectionId) {
        this.adminSectionId = adminSectionId;
    }

    public AdminSection(Long adminSectionId, Long adminSectionParentId) {
        this.adminSectionId = adminSectionId;
        this.adminSectionParentId = adminSectionParentId;
    }

    public Long getAdminSectionId() {
        return adminSectionId;
    }

    public void setAdminSectionId(Long adminSectionId) {
        this.adminSectionId = adminSectionId;
    }

    public Long getAdminSectionParentId() {
        return adminSectionParentId;
    }

    public void setAdminSectionParentId(Long adminSectionParentId) {
        this.adminSectionParentId = adminSectionParentId;
    }

    public String getSectionKey() {
        return sectionKey;
    }

    public void setSectionKey(String sectionKey) {
        this.sectionKey = sectionKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    public Integer getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(Integer sectionOrder) {
        this.sectionOrder = sectionOrder;
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
        hash += (adminSectionId != null ? adminSectionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminSection)) {
            return false;
        }
        AdminSection other = (AdminSection) object;
        if ((this.adminSectionId == null && other.adminSectionId != null) || (this.adminSectionId != null && !this.adminSectionId.equals(other.adminSectionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.AdminSection[ adminSectionId=" + adminSectionId + " ]";
    }
    
}
