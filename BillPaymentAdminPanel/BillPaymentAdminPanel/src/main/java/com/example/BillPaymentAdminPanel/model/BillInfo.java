package com.example.BillPaymentAdminPanel.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bill_info")
public class BillInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_number")
    private Users users;
    private String bill_number;
    private String utility_tranxn_id;
    private String bank_tranxn_id;
    private int bill_type;
    @Temporal(TemporalType.TIMESTAMP)
    private Date issue_date;
    private double bill_amount;
    private double vat_amount;
    private double total_amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date pay_date;
    private String paid_by;
    private double paid_amount;
    private double due_amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date due_date;
    @OneToOne
    @JoinColumn(name = "stake_Id")
    private StakeHolder stakeHolder;

    @OneToOne
    @JoinColumn(name = "bill_status")
    private BillStatusInfo bill_status_info;
    private String canceled_by;
    @Temporal(TemporalType.TIMESTAMP)
    private Date cancel_date;
    private String remarks;

    public BillInfo() {
    }

    public BillInfo(Users users, String bill_number, String utility_tranxn_id, String bank_tranxn_id, int bill_type, Date issue_date, double bill_amount, double vat_amount, double total_amount, Date pay_date, String paid_by, double paid_amount, double due_amount, Date due_date, BillStatusInfo bill_status_info, String canceled_by, Date cancel_date, String remarks) {
        this.users = users;
        this.bill_number = bill_number;
        this.utility_tranxn_id = utility_tranxn_id;
        this.bank_tranxn_id = bank_tranxn_id;
        this.bill_type = bill_type;
        this.issue_date = issue_date;
        this.bill_amount = bill_amount;
        this.vat_amount = vat_amount;
        this.total_amount = total_amount;
        this.pay_date = pay_date;
        this.paid_by = paid_by;
        this.paid_amount = paid_amount;
        this.due_amount = due_amount;
        this.due_date = due_date;
        this.bill_status_info = bill_status_info;
        this.canceled_by = canceled_by;
        this.cancel_date = cancel_date;
        this.remarks = remarks;
    }

    public StakeHolder getStakeHolder() {
        return stakeHolder;
    }

    public void setStakeHolder(StakeHolder stakeHolder) {
        this.stakeHolder = stakeHolder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getBill_number() {
        return bill_number;
    }

    public void setBill_number(String bill_number) {
        this.bill_number = bill_number;
    }

    public String getUtility_tranxn_id() {
        return utility_tranxn_id;
    }

    public void setUtility_tranxn_id(String utility_tranxn_id) {
        this.utility_tranxn_id = utility_tranxn_id;
    }

    public String getBank_tranxn_id() {
        return bank_tranxn_id;
    }

    public void setBank_tranxn_id(String bank_tranxn_id) {
        this.bank_tranxn_id = bank_tranxn_id;
    }

    public int getBill_type() {
        return bill_type;
    }

    public void setBill_type(int bill_type) {
        this.bill_type = bill_type;
    }

    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public double getBill_amount() {
        return bill_amount;
    }

    public void setBill_amount(double bill_amount) {
        this.bill_amount = bill_amount;
    }

    public double getVat_amount() {
        return vat_amount;
    }

    public void setVat_amount(double vat_amount) {
        this.vat_amount = vat_amount;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    public String getPaid_by() {
        return paid_by;
    }

    public void setPaid_by(String paid_by) {
        this.paid_by = paid_by;
    }

    public double getPaid_amount() {
        return paid_amount;
    }

    public void setPaid_amount(double paid_amount) {
        this.paid_amount = paid_amount;
    }

    public double getDue_amount() {
        return due_amount;
    }

    public void setDue_amount(double due_amount) {
        this.due_amount = due_amount;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public BillStatusInfo getBill_status_info() {
        return bill_status_info;
    }

    public void setBill_status_info(BillStatusInfo bill_status_info) {
        this.bill_status_info = bill_status_info;
    }

    public String getCanceled_by() {
        return canceled_by;
    }

    public void setCanceled_by(String canceled_by) {
        this.canceled_by = canceled_by;
    }

    public Date getCancel_date() {
        return cancel_date;
    }

    public void setCancel_date(Date cancel_date) {
        this.cancel_date = cancel_date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
