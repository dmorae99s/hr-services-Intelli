package com.training.hr.hrservices.repository;


import com.training.hr.hrservices.domain.model.HRPayments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface HRPaymentsRepository extends JpaRepository<HRPayments, Integer> {
    List<HRPayments> findByEmpId(int empId);
/*
    @Query("SELECT p FROM HRPayments p WHERE (:reqDate IS NULL or p.transaction_date = %:reqDate%) ")
    List<HRPayments> findByTransactionDate(@Param("reqDate") LocalDate reqDate);

 */

}
