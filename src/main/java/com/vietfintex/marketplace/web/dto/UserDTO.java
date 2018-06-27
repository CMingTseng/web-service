package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long userId;
    private Character status;
    private Character userType;
    private String userLogin;
    private String referer;
    private Character isRoot;
    private int companyId;
    private int lastLogin;
    private int timestamp;
    private String firstname;
    private String lastname;
    private String company;
    private String email;
    private String phone;
    private String fax;
    private String url;
    private Character taxExempt;
    private int birthday;
    private int purchaseTimestampFrom;
    private int purchaseTimestampTo;
    private String responsibleEmail;
    private String lastPasswords;
    private int passwordChangeTimestamp;
    private String apiKey;
    private String janrainIdentifier;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getUserType() {
        return userType;
    }

    public void setUserType(Character userType) {
        this.userType = userType;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public Character getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(Character isRoot) {
        this.isRoot = isRoot;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(int lastLogin) {
        this.lastLogin = lastLogin;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Character getTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(Character taxExempt) {
        this.taxExempt = taxExempt;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getPurchaseTimestampFrom() {
        return purchaseTimestampFrom;
    }

    public void setPurchaseTimestampFrom(int purchaseTimestampFrom) {
        this.purchaseTimestampFrom = purchaseTimestampFrom;
    }

    public int getPurchaseTimestampTo() {
        return purchaseTimestampTo;
    }

    public void setPurchaseTimestampTo(int purchaseTimestampTo) {
        this.purchaseTimestampTo = purchaseTimestampTo;
    }

    public String getResponsibleEmail() {
        return responsibleEmail;
    }

    public void setResponsibleEmail(String responsibleEmail) {
        this.responsibleEmail = responsibleEmail;
    }

    public String getLastPasswords() {
        return lastPasswords;
    }

    public void setLastPasswords(String lastPasswords) {
        this.lastPasswords = lastPasswords;
    }

    public int getPasswordChangeTimestamp() {
        return passwordChangeTimestamp;
    }

    public void setPasswordChangeTimestamp(int passwordChangeTimestamp) {
        this.passwordChangeTimestamp = passwordChangeTimestamp;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getJanrainIdentifier() {
        return janrainIdentifier;
    }

    public void setJanrainIdentifier(String janrainIdentifier) {
        this.janrainIdentifier = janrainIdentifier;
    }
}
