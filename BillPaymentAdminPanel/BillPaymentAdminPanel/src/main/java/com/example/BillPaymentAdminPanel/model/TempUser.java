package com.example.BillPaymentAdminPanel.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TempUser {

    int customerId;
    int billNumber;
    int stakeholderId;
    int statusId;
    double amountForm;
    double amountTo;
    String stardDate;
    String endDate;

    public TempUser() {
    }

    public TempUser(int customerId, int billNumber, int stakeholderId, int statusId, double amountForm, double amountTo, String stardDate, String endDate) {
        this.customerId = customerId;
        this.billNumber = billNumber;
        this.stakeholderId = stakeholderId;
        this.statusId = statusId;
        this.amountForm = amountForm;
        this.amountTo = amountTo;
        this.stardDate = stardDate;
        this.endDate = endDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public int getStakeholderId() {
        return stakeholderId;
    }

    public void setStakeholderId(int stakeholderId) {
        this.stakeholderId = stakeholderId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public double getAmountForm() {
        return amountForm;
    }

    public void setAmountForm(double amountForm) {
        this.amountForm = amountForm;
    }

    public double getAmountTo() {
        return amountTo;
    }

    public void setAmountTo(double amountTo) {
        this.amountTo = amountTo;
    }

    public String getStardDate() {
        return stardDate;
    }

    public void setStardDate(String stardDate) {
        this.stardDate = stardDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    //    String searchOption;
//    String id;
//    String endAmount;
//    String startDate;
//    String endDate;
//
//
//    public TempUser() {
//    }
//
//    public TempUser(String searchOption, String id, String endAmount, String startDate, String endDate) {
//        this.searchOption = searchOption;
//        this.id = id;
//        this.endAmount = endAmount;
//        this.startDate = startDate;
//        this.endDate = endDate;
//    }
//
//    public String getSearchOption() {
//        return searchOption;
//    }
//
//    public void setSearchOption(String searchOption) {
//        this.searchOption = searchOption;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getEndAmount() {
//        return endAmount;
//    }
//
//    public void setEndAmount(String endAmount) {
//        this.endAmount = endAmount;
//    }
//
//    public String getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(String startDate) {
//        this.startDate = startDate;
//    }
//
//    public String getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(String endDate) {
//        this.endDate = endDate;
//    }
}
