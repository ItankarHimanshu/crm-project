package com.crm.backend.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private String name;
    private String email;
    private String phone;
    private String company;
    private String address;
    private Long salesRepId;
    private String notes;
}
