package com.example.BillPaymentAdminPanel.repository;

import com.example.BillPaymentAdminPanel.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    public Users findByUsername(String username);
}
