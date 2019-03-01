package com.example.BillPaymentAdminPanel.repository;

import com.example.BillPaymentAdminPanel.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    public Optional<Role> findByRole(String role);
}
