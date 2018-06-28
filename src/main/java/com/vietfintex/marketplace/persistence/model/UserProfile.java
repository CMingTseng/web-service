/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import com.vietfintex.marketplace.web.dto.UserDTO;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Dell
 */
@Entity
@Table(name = "user_profile")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "UserProfile.findAll", query = "SELECT u FROM UserProfile u")})
public class UserProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "profile_id")
    private Long profileId;
    @Column(name = "user_id")
    private BigInteger userId;
    @Column(name = "profile_type")
    private Character profileType;
    @Column(name = "b_firstname")
    private String bFirstname;
    @Column(name = "b_lastname")
    private String bLastname;
    @Column(name = "b_address")
    private String bAddress;
    @Column(name = "b_address_2")
    private String bAddress2;
    @Column(name = "b_city")
    private String bCity;
    @Column(name = "b_county")
    private String bCounty;
    @Column(name = "b_state")
    private String bState;
    @Column(name = "b_country")
    private String bCountry;
    @Column(name = "b_zipcode")
    private String bZipcode;
    @Column(name = "b_phone")
    private String bPhone;
    @Column(name = "s_firstname")
    private String sFirstname;
    @Column(name = "s_lastname")
    private String sLastname;
    @Column(name = "s_address")
    private String sAddress;
    @Column(name = "s_address_2")
    private String sAddress2;
    @Column(name = "s_city")
    private String sCity;
    @Column(name = "s_county")
    private String sCounty;
    @Column(name = "s_state")
    private String sState;
    @Column(name = "s_country")
    private String sCountry;
    @Column(name = "s_zipcode")
    private String sZipcode;
    @Column(name = "s_phone")
    private String sPhone;
    @Column(name = "s_address_type")
    private String sAddressType;
    @Column(name = "profile_name")
    private String profileName;
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    public UserProfile() {
    }

    public UserProfile(Long profileId) {
        this.profileId = profileId;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public Character getProfileType() {
        return profileType;
    }

    public void setProfileType(Character profileType) {
        this.profileType = profileType;
    }

    public String getBFirstname() {
        return bFirstname;
    }

    public void setBFirstname(String bFirstname) {
        this.bFirstname = bFirstname;
    }

    public String getBLastname() {
        return bLastname;
    }

    public void setBLastname(String bLastname) {
        this.bLastname = bLastname;
    }

    public String getBAddress() {
        return bAddress;
    }

    public void setBAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public String getBAddress2() {
        return bAddress2;
    }

    public void setBAddress2(String bAddress2) {
        this.bAddress2 = bAddress2;
    }

    public String getBCity() {
        return bCity;
    }

    public void setBCity(String bCity) {
        this.bCity = bCity;
    }

    public String getBCounty() {
        return bCounty;
    }

    public void setBCounty(String bCounty) {
        this.bCounty = bCounty;
    }

    public String getBState() {
        return bState;
    }

    public void setBState(String bState) {
        this.bState = bState;
    }

    public String getBCountry() {
        return bCountry;
    }

    public void setBCountry(String bCountry) {
        this.bCountry = bCountry;
    }

    public String getBZipcode() {
        return bZipcode;
    }

    public void setBZipcode(String bZipcode) {
        this.bZipcode = bZipcode;
    }

    public String getBPhone() {
        return bPhone;
    }

    public void setBPhone(String bPhone) {
        this.bPhone = bPhone;
    }

    public String getSFirstname() {
        return sFirstname;
    }

    public void setSFirstname(String sFirstname) {
        this.sFirstname = sFirstname;
    }

    public String getSLastname() {
        return sLastname;
    }

    public void setSLastname(String sLastname) {
        this.sLastname = sLastname;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getSAddress2() {
        return sAddress2;
    }

    public void setSAddress2(String sAddress2) {
        this.sAddress2 = sAddress2;
    }

    public String getSCity() {
        return sCity;
    }

    public void setSCity(String sCity) {
        this.sCity = sCity;
    }

    public String getSCounty() {
        return sCounty;
    }

    public void setSCounty(String sCounty) {
        this.sCounty = sCounty;
    }

    public String getSState() {
        return sState;
    }

    public void setSState(String sState) {
        this.sState = sState;
    }

    public String getSCountry() {
        return sCountry;
    }

    public void setSCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    public String getSZipcode() {
        return sZipcode;
    }

    public void setSZipcode(String sZipcode) {
        this.sZipcode = sZipcode;
    }

    public String getSPhone() {
        return sPhone;
    }

    public void setSPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getSAddressType() {
        return sAddressType;
    }

    public void setSAddressType(String sAddressType) {
        this.sAddressType = sAddressType;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profileId != null ? profileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserProfile)) {
            return false;
        }
        UserProfile other = (UserProfile) object;
        if ((this.profileId == null && other.profileId != null) || (this.profileId != null && !this.profileId.equals(other.profileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.UserProfile[ profileId=" + profileId + " ]";
    }

}
