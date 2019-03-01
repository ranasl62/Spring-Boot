package com.example.BillPaymentAdminPanel.repository;

import com.example.BillPaymentAdminPanel.model.BillInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<BillInfo, Integer>{

}
