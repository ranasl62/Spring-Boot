package com.example.BillPaymentAdminPanel.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "access_logs")
public class AccessLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "log_text")
    private String logtext;
    @Column(name = "access_by")
    private String access_by;
    @Temporal(TemporalType.DATE)
    private Date access_time;

    public AccessLogs() {
    }


    public AccessLogs(String logtext, String access_by, Date access_time) {
        this.logtext = logtext;
        this.access_by = access_by;
        this.access_time = access_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogtext() {
        return logtext;
    }

    public void setLogtext(String logtext) {
        this.logtext = logtext;
    }

    public String getAccess_by() {
        return access_by;
    }

    public void setAccess_by(String access_by) {
        this.access_by = access_by;
    }

    public Date getAccess_time() {
        return access_time;
    }

    public void setAccess_time(Date access_time) {
        this.access_time = access_time;
    }
}
