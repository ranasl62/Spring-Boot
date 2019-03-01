package com.example.BillPaymentAdminPanel.model;

import javax.persistence.*;

@Entity
@Table(name = "bill_status_info")
public class BillStatusInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int status;
    private String meaning;

    public BillStatusInfo() {
    }

    public BillStatusInfo(int status, String meaning) {
        this.status = status;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
