/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.web.dto;

import java.io.Serializable;

public class ImageDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long imageId;
    private String imagePath;
    private Long imageX;
    private Long imageY;
    private String filename;
    private String data;
    private Long objectId;
    private String objectType;

    public ImageDTO() {
    }

    public ImageDTO(Long imageId) {
        this.imageId = imageId;
    }

    public ImageDTO(Long imageId, String imagePath, Long imageX, Long imageY) {
        this.imageId = imageId;
        this.imagePath = imagePath;
        this.imageX = imageX;
        this.imageY = imageY;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Long getImageX() {
        return imageX;
    }

    public void setImageX(Long imageX) {
        this.imageX = imageX;
    }

    public Long getImageY() {
        return imageY;
    }

    public void setImageY(Long imageY) {
        this.imageY = imageY;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imageId != null ? imageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImageDTO)) {
            return false;
        }
        ImageDTO other = (ImageDTO) object;
        if ((this.imageId == null && other.imageId != null) || (this.imageId != null && !this.imageId.equals(other.imageId))) {
            return false;
        }
        return true;
    }

}
