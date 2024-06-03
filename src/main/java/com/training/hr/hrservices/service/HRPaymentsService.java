package com.training.hr.hrservices.service;

import com.training.hr.hrservices.domain.model.HRPayments;

import java.util.List;

public interface HRPaymentsService {
    public List<HRPayments> findAll();
    //public HRPayments findById(int id);
    public List<HRPayments> findByEmpId(int empId);
}
