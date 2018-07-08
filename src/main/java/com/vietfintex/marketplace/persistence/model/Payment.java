/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "payment_id")
    private Long paymentId;
    @Basic(optional = false)
    @Column(name = "payment")
    private String payment;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Lob
    @Column(name = "instructions")
    private String instructions;
    @Basic(optional = false)
    @Column(name = "store_id")
    private Long storeId;
    @Basic(optional = false)
    @Column(name = "position")
    private Long position;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "template")
    private String template;
    @Basic(optional = false)
    @Column(name = "processor")
    private String processor;
    @Lob
    @Column(name = "processor_params")
    private String processorParams;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "a_surcharge")
    private Double aSurcharge;
    @Basic(optional = false)
    @Column(name = "p_surcharge")
    private Double pSurcharge;
    @Basic(optional = false)
    @Column(name = "tax_ids")
    private String taxIds;
    @Basic(optional = false)
    @Column(name = "payment_category")
    private String paymentCategory;

    public Payment() {
    }

    public Payment(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Payment(Long paymentId, String payment, String description, Long storeId, Long position, String status, String template, String processor, Double aSurcharge, Double pSurcharge, String taxIds, String paymentCategory) {
        this.paymentId = paymentId;
        this.payment = payment;
        this.description = description;
        this.storeId = storeId;
        this.position = position;
        this.status = status;
        this.template = template;
        this.processor = processor;
        this.aSurcharge = aSurcharge;
        this.pSurcharge = pSurcharge;
        this.taxIds = taxIds;
        this.paymentCategory = paymentCategory;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessorParams() {
        return processorParams;
    }

    public void setProcessorParams(String processorParams) {
        this.processorParams = processorParams;
    }

    public Double getASurcharge() {
        return aSurcharge;
    }

    public void setASurcharge(Double aSurcharge) {
        this.aSurcharge = aSurcharge;
    }

    public Double getPSurcharge() {
        return pSurcharge;
    }

    public void setPSurcharge(Double pSurcharge) {
        this.pSurcharge = pSurcharge;
    }

    public String getTaxIds() {
        return taxIds;
    }

    public void setTaxIds(String taxIds) {
        this.taxIds = taxIds;
    }

    public String getPaymentCategory() {
        return paymentCategory;
    }

    public void setPaymentCategory(String paymentCategory) {
        this.paymentCategory = paymentCategory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.Payment[ paymentId=" + paymentId + " ]";
    }
    
}
