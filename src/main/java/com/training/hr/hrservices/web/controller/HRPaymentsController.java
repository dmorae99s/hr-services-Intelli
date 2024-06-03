package com.training.hr.hrservices.web.controller;

import com.training.hr.hrservices.domain.model.HRPayments;
import com.training.hr.hrservices.service.HRPaymentsService;
import com.training.hr.hrservices.web.dto.HRPaymentsDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/payments")
@AllArgsConstructor
public class HRPaymentsController {

    private final HRPaymentsService hrPaymentsService;

    @GetMapping
    public List<HRPaymentsDTO> getAllPayments() {
        List<HRPayments> hrPaymentsList = hrPaymentsService.findAll();

        return hrPaymentsList.stream().map(p->new HRPaymentsDTO(p)).toList();
    }
    @GetMapping(value = "/{empId}")
    public List<HRPaymentsDTO> getPaymentsByEmpId(@PathVariable int empId) {
        List<HRPayments> hrPaymentsList = hrPaymentsService.findByEmpId(empId);
        return hrPaymentsList.stream().map(p->new HRPaymentsDTO(p)).toList();
    }

}
