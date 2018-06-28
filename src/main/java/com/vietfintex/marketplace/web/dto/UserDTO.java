package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vietfintex.marketplace.util.ExcludeFieldMapper;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long userId;
    private String status;
    private String userType;
    private String userLogin;
    private String referer;
    private String isRoot;
    private Long companyId;
    private Long lastLogin;
    private Long timestamp;
    private String firstname;
    private String lastname;
    private String company;
    private String email;
    private String phone;
    private String fax;
    private String url;
    private String taxExempt;
    private Long birthday;
    private Long purchaseTimestampFrom;
    private Long purchaseTimestampTo;
    private String responsibleEmail;
    private String lastPasswords;
    private Long passwordChangeTimestamp;
    private String apiKey;
    private String janrainIdentifier;
    @ExcludeFieldMapper
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
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

    public String getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(String isRoot) {
        this.isRoot = isRoot;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
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

    public String getTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(String taxExempt) {
        this.taxExempt = taxExempt;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public Long getPurchaseTimestampFrom() {
        return purchaseTimestampFrom;
    }

    public void setPurchaseTimestampFrom(Long purchaseTimestampFrom) {
        this.purchaseTimestampFrom = purchaseTimestampFrom;
    }

    public Long getPurchaseTimestampTo() {
        return purchaseTimestampTo;
    }

    public void setPurchaseTimestampTo(Long purchaseTimestampTo) {
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

    public Long getPasswordChangeTimestamp() {
        return passwordChangeTimestamp;
    }

    public void setPasswordChangeTimestamp(Long passwordChangeTimestamp) {
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
