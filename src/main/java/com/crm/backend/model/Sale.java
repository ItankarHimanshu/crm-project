package com.crm.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private SalesStatus status;

    private LocalDate date;

    @ManyToOne
    private User assignedSalesRep;

}
