package com.training.hr.hrservices.web.dto;

import com.training.hr.hrservices.domain.model.HRPayments;

import java.time.LocalDate;

public class HRPaymentsDTO {
    private int id;
    private int empId;
    private String concept;
    private int amount;
    private LocalDate transactionDate;


    public HRPaymentsDTO(HRPayments hrPayments){
        this.id = hrPayments.getId();
        this.empId = hrPayments.getEmpId();
        this.concept = hrPayments.getConcept();
        this.amount = hrPayments.getAmount();
        this.transactionDate = hrPayments.getTransactionDate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
}
