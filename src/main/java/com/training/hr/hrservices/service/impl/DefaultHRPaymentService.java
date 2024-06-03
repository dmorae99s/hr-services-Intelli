package com.training.hr.hrservices.service.impl;

import com.training.hr.hrservices.domain.model.HRPayments;
import com.training.hr.hrservices.repository.HRPaymentsRepository;
import com.training.hr.hrservices.service.HRPaymentsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultHRPaymentService implements HRPaymentsService {
    private HRPaymentsRepository hrPaymentsRepository;


    @Override
    public List<HRPayments> findAll() {
        return hrPaymentsRepository.findAll();
    }

    /*
    @Override
    public HRPayments findById(int id) {
        return null;
    }
    */

    @Override
    public List<HRPayments> findByEmpId(int empId) {
        return hrPaymentsRepository.findByEmpId(empId);
    }

}
