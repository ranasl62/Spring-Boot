package com.example.BillPaymentAdminPanel.domain;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

public class Authority implements GrantedAuthority, Serializable{

    public static final long serialVersionUID = 123123L;
    public final String authority;

    public Authority (String authority){
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
