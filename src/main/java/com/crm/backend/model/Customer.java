package com.crm.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String company;
    private String address;

    @ManyToOne
    @JoinColumn(name="sales_rep_id")
    private User assignedSalesRep;

    private String notes;
}
