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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "images_link")
public class ImagesLink implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pair_id")
    private Long pairId;
    @Basic(optional = false)
    @Column(name = "object_id")
    private Long objectId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private String objectType;
    @Basic(optional = false)
    @Column(name = "image_id")
    private Long imageId;
    @Basic(optional = false)
    @Column(name = "detailed_id")
    private Long detailedId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "position")
    private Long position;

    public ImagesLink() {
    }

    public ImagesLink(Long pairId) {
        this.pairId = pairId;
    }

    public ImagesLink(Long pairId, Long objectId, String objectType, Long imageId, Long detailedId, Character type, Long position) {
        this.pairId = pairId;
        this.objectId = objectId;
        this.objectType = objectType;
        this.imageId = imageId;
        this.detailedId = detailedId;
        this.type = type;
        this.position = position;
    }

    public Long getPairId() {
        return pairId;
    }

    public void setPairId(Long pairId) {
        this.pairId = pairId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getDetailedId() {
        return detailedId;
    }

    public void setDetailedId(Long detailedId) {
        this.detailedId = detailedId;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pairId != null ? pairId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImagesLink)) {
            return false;
        }
        ImagesLink other = (ImagesLink) object;
        if ((this.pairId == null && other.pairId != null) || (this.pairId != null && !this.pairId.equals(other.pairId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.ImagesLink[ pairId=" + pairId + " ]";
    }
    
}
