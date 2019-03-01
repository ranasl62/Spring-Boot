package com.example.BillPaymentAdminPanel.repository;

import com.example.BillPaymentAdminPanel.model.StakeHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StakeHolderRepository extends JpaRepository<StakeHolder, Integer>{
}
