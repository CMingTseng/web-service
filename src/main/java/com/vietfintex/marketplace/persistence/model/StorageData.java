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
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "storage_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StorageData.findAll", query = "SELECT s FROM StorageData s")
    , @NamedQuery(name = "StorageData.findByDataKey", query = "SELECT s FROM StorageData s WHERE s.dataKey = :dataKey")})
public class StorageData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "data_key")
    private String dataKey;
    @Lob
    @Column(name = "data")
    private byte[] data;

    public StorageData() {
    }

    public StorageData(String dataKey) {
        this.dataKey = dataKey;
    }

    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataKey != null ? dataKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StorageData)) {
            return false;
        }
        StorageData other = (StorageData) object;
        if ((this.dataKey == null && other.dataKey != null) || (this.dataKey != null && !this.dataKey.equals(other.dataKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StorageData[ dataKey=" + dataKey + " ]";
    }
    
}
