package com.training.hr.hrservices.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "hr_payments")
public class HRPayments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "emp_id")
    private int empId;

    @Column(name = "concept")
    private String concept;

    @Column(name = "amount")
    private int amount;

    @Column(name = "transaction_date")
    private LocalDate transactionDate;

}
