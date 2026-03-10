package com.crm.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactInfo;

    private String source;

    @Enumerated(EnumType.STRING)
    private LeadStatus status;

    @ManyToOne
    private User assignedSalesRep;

}
