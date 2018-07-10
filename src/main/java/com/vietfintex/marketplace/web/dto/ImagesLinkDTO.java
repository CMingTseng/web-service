/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.web.dto;

import java.io.Serializable;

public class ImagesLinkDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long pairId;
    private Long objectId;
    private String objectType;
    private Long imageId;
    private Long detailedId;
    private String type;
    private Long position;

    public ImagesLinkDTO() {
    }

    public ImagesLinkDTO(Long pairId) {
        this.pairId = pairId;
    }

    public ImagesLinkDTO(Long pairId, Long objectId, String objectType, Long imageId, Long detailedId, String type, Long position) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
        if (!(object instanceof ImagesLinkDTO)) {
            return false;
        }
        ImagesLinkDTO other = (ImagesLinkDTO) object;
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
