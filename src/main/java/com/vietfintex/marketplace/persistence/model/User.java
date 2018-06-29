/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "status")
    private String status;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "referer")
    private String referer;
    @Column(name = "is_root")
    private String isRoot;
    @Column(name = "company_id")
    private Integer companyId;
    @Basic(optional = false)
    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Basic(optional = false)
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @Column(name = "password")
    private String password;
    @Column(name = "salt")
    private String salt;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "company")
    private String company;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "fax")
    private String fax;
    @Column(name = "url")
    private String url;
    @Column(name = "tax_exempt")
    private String taxExempt;
    @Column(name = "lang_code")
    private String langCode;
    @Basic(optional = false)
    @Column(name = "birthday")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;
    @Basic(optional = false)
    @Column(name = "purchase_timestamp_from")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseTimestampFrom;
    @Basic(optional = false)
    @Column(name = "purchase_timestamp_to")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseTimestampTo;
    @Column(name = "responsible_email")
    private String responsibleEmail;
    @Column(name = "last_passwords")
    private String lastPasswords;
    @Basic(optional = false)
    @Column(name = "password_change_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date passwordChangeTimestamp;
    @Column(name = "api_key")
    private String apiKey;
    @Column(name = "janrain_identifier")
    private String janrainIdentifier;
    @Column(name = "sex")
    private String sex;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserProfile profile;

    public User() {
    }

    public User(Long userId) {
        this.userId = userId;
    }

    public User(Long userId, Date lastLogin, Date timestamp, Date birthday, Date purchaseTimestampFrom, Date purchaseTimestampTo, Date passwordChangeTimestamp) {
        this.userId = userId;
        this.lastLogin = lastLogin;
        this.timestamp = timestamp;
        this.birthday = birthday;
        this.purchaseTimestampFrom = purchaseTimestampFrom;
        this.purchaseTimestampTo = purchaseTimestampTo;
        this.passwordChangeTimestamp = passwordChangeTimestamp;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getPurchaseTimestampFrom() {
        return purchaseTimestampFrom;
    }

    public void setPurchaseTimestampFrom(Date purchaseTimestampFrom) {
        this.purchaseTimestampFrom = purchaseTimestampFrom;
    }

    public Date getPurchaseTimestampTo() {
        return purchaseTimestampTo;
    }

    public void setPurchaseTimestampTo(Date purchaseTimestampTo) {
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

    public Date getPasswordChangeTimestamp() {
        return passwordChangeTimestamp;
    }

    public void setPasswordChangeTimestamp(Date passwordChangeTimestamp) {
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

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.User[ userId=" + userId + " ]";
    }
    
}
