package com.abm.Automation.dto;

import java.util.Date;
import java.util.List;

public class Terminalbulkdata {
//     "bankName": "Example Bank",
//             "month": "2022-03-06",
//             "editableData": editableData[0]

    private String bankName;
    private Date month;
     private List<List<String>> editableData;

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

    public List<List<String>> getEditableData() {
        return editableData;
    }

    public void setEditableData(List<List<String>> editableData) {
        this.editableData = editableData;
    }

    public Terminalbulkdata(String bankName, Date month, List<List<String>> editableData) {
        this.bankName = bankName;
        this.month = month;
        this.editableData = editableData;
    }

    public Terminalbulkdata() {
    }

    @Override
    public String toString() {
        return "Terminalbulkdata{" +
                "bankName='" + bankName + '\'' +
                ", month='" + month + '\'' +
                ", editableData=" + editableData +
                '}';
    }
}
