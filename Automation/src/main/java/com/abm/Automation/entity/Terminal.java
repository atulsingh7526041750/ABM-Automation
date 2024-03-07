package com.abm.Automation.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bankName;
    private Date month;
    private String category;
    private String subCategory;
    private Long ruPayAccepting;
    private Long contactOnly;
    private Long contactlessRuPay;
    private Long offlinePayments;
    private Long installedBharatQR;

    public Terminal(long l, String s, Date date, String retail, String poSTerminal, int i, int i1, int i2, int i3, int i4) {
    }

    public Terminal(String bankName, Date month, String category, String subCategory, Long ruPayAccepting, Long contactOnly, Long contactlessRuPay, Long offlinePayments, Long installedBharatQR) {
        this.bankName = bankName;
        this.month = month;
        this.category = category;
        this.subCategory = subCategory;
        this.ruPayAccepting = ruPayAccepting;
        this.contactOnly = contactOnly;
        this.contactlessRuPay = contactlessRuPay;
        this.offlinePayments = offlinePayments;
        this.installedBharatQR = installedBharatQR;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Long getRuPayAccepting() {
        return ruPayAccepting;
    }

    public void setRuPayAccepting(Long ruPayAccepting) {
        this.ruPayAccepting = ruPayAccepting;
    }

    public Long getContactOnly() {
        return contactOnly;
    }

    public void setContactOnly(Long contactOnly) {
        this.contactOnly = contactOnly;
    }

    public Long getContactlessRuPay() {
        return contactlessRuPay;
    }

    public void setContactlessRuPay(Long contactlessRuPay) {
        this.contactlessRuPay = contactlessRuPay;
    }

    public Long getOfflinePayments() {
        return offlinePayments;
    }

    public void setOfflinePayments(Long offlinePayments) {
        this.offlinePayments = offlinePayments;
    }

    public Long getInstalledBharatQR() {
        return installedBharatQR;
    }

    public void setInstalledBharatQR(Long installedBharatQR) {
        this.installedBharatQR = installedBharatQR;
    }

    public Terminal() {
    }
}
