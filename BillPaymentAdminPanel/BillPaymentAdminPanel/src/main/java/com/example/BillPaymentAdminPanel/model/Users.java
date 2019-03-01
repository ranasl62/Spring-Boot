package com.example.BillPaymentAdminPanel.model;

import com.example.BillPaymentAdminPanel.domain.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class Users implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int userid;
    @NotNull
    @Size(min=3, max = 20)
    private String name;
    @NotNull
    @Size(min = 3, max = 10)
    private String username;
    private String password;
    private String is_stakeholder_user;
    @OneToOne
    @JoinColumn(name = "stakeholder_id")
    private StakeHolder stakeHolder;
    private String created_by;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_time;
    private String updated_by;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_time;
    private int status;
    @Transient
    private String role;
    @Transient
    private int transientId;
    @OneToMany(mappedBy = "users")
    private Set<BillInfo> billInfo;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<UserRole> userRoles = new HashSet<>();

    public Users() {
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public int getTransientId() {
        return transientId;
    }

    public void setTransientId(int transientId) {
        this.transientId = transientId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getId() {
        return userid;
    }

    public void setId(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIs_stakeholder_user() {
        return is_stakeholder_user;
    }

    public void setIs_stakeholder_user(String is_stakeholder_user) {
        this.is_stakeholder_user = is_stakeholder_user;
    }

    public StakeHolder getStakeHolder() {
        return stakeHolder;
    }

    public void setStakeHolder(StakeHolder stakeHolder) {
        this.stakeHolder = stakeHolder;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getUserRoles().stream().map(role -> new SimpleGrantedAuthority(role.getRole().getRole()))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", is_stakeholder_user='" + is_stakeholder_user + '\'' +
                ", stakeHolder=" + stakeHolder +
                ", created_by='" + created_by + '\'' +
                ", created_time=" + created_time +
                ", updated_by='" + updated_by + '\'' +
                ", updated_time=" + updated_time +
                ", status=" + status +
                ", role='" + role + '\'' +
                ", transientId=" + transientId +
                ", userRoles=" + userRoles +
                '}';
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}