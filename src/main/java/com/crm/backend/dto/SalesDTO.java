package com.crm.backend.dto;

import com.crm.backend.model.SalesStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SalesDTO {
    private Long customerId;
    private Double amount;
    private SalesStatus status;
    private LocalDate date;
    private Long salesRepId;
}
