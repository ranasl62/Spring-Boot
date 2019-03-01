package com.example.BillPaymentAdminPanel.service;

import com.example.BillPaymentAdminPanel.domain.UserRole;
import com.example.BillPaymentAdminPanel.model.Users;
import com.example.BillPaymentAdminPanel.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserSecurityService implements UserDetailsService{

    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);

    @Autowired
    private UserRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Users user = studentRepository.findByUsername(id);

        Set<UserRole> userRoleSet = null;

        if( user != null){
           userRoleSet = user.getUserRoles();
        }


        if(userRoleSet != null){
            for(UserRole ur: userRoleSet){

                if(ur.getRole().getRole().equals("ROLE_STAKEHOLDER_API")){

                    user = new Users();
                    return user;
                }
            }
        }

        if(user == null){
            LOG.warn("Username not found", id);
            throw new UsernameNotFoundException("Id " + id + "not found");
        }
        return user;
    }
}
