package com.abm.Automation.dto;

import java.util.Date;

public class TerminalDto {

    private String bankName;
    private Date month;
    private String category;
    private String subCategory;
    private Long ruPayAccepting;
    private Long contactOnly;
    private Long contactlessRuPay;
    private Long offlinePayments;
    private Long installedBharatQR;

    // Constructors
    public TerminalDto() {
    }

    public TerminalDto(String bankName, Date month, String category, String subCategory, Long ruPayAccepting, Long contactOnly, Long contactlessRuPay, Long offlinePayments, Long installedBharatQR) {
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

    // Getters and setters
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

    @Override
    public String toString() {
        return "TerminalDto{" +
                "bankName='" + bankName + '\'' +
                ", month=" + month +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", ruPayAccepting=" + ruPayAccepting +
                ", contactOnly=" + contactOnly +
                ", contactlessRuPay=" + contactlessRuPay +
                ", offlinePayments=" + offlinePayments +
                ", installedBharatQR=" + installedBharatQR +
                '}';
    }
}
