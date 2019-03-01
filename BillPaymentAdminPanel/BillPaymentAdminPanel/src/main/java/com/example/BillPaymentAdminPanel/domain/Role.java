package com.example.BillPaymentAdminPanel.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role implements Serializable{
    @Id
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role")
    private String role;
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UserRole> userRoleSet = new HashSet<>();

    public Role() {
    }

    public Role(int roleId, String role, Set<UserRole> userRoleSet) {
        this.roleId = roleId;
        this.role = role;
        this.userRoleSet = userRoleSet;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<UserRole> getUserRoleSet() {
        return userRoleSet;
    }

    public void setUserRoleSet(Set<UserRole> userRoleSet) {
        this.userRoleSet = userRoleSet;
    }
}
