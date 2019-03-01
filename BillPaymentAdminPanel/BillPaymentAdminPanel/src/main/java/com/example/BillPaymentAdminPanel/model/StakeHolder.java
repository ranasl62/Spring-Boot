package com.example.BillPaymentAdminPanel.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "stakeholder_info")
public class StakeHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int stakeholder_id;
    @NotNull
    @Size(min = 3, max = 20)
    private String name;
    @NotNull
    @Size(min = 5, max = 20)
    private String address;
    @NotNull
    @Size(min = 3, max = 20)
    private String contact_person_name;
    @NotNull
    @Size(min = 3, max = 20)
    private String contact_person_mobile;
    private int status;

    public StakeHolder() {
    }

    public StakeHolder(int stakeholder_id, String name, String address, String contact_person_name, String contact_person_mobile, int status) {
        this.name = name;
        this.address = address;
        this.contact_person_name = contact_person_name;
        this.contact_person_mobile = contact_person_mobile;
        this.status = status;
        this.stakeholder_id = stakeholder_id;
    }

    public int getId() {
        return stakeholder_id;
    }

    public void setId(int stakeholder_id) {
        this.stakeholder_id = stakeholder_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_person_name() {
        return contact_person_name;
    }

    public void setContact_person_name(String contact_person_name) {
        this.contact_person_name = contact_person_name;
    }

    public String getContact_person_mobile() {
        return contact_person_mobile;
    }

    public void setContact_person_mobile(String contact_person_mobile) {
        this.contact_person_mobile = contact_person_mobile;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStakeholder_id() {
        return stakeholder_id;
    }

    @Override
    public String toString() {
        return "StakeHolder{" +
                "stakeholder_id=" + stakeholder_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact_person_name='" + contact_person_name + '\'' +
                ", contact_person_mobile='" + contact_person_mobile + '\'' +
                ", status=" + status +
                '}';
    }
}
