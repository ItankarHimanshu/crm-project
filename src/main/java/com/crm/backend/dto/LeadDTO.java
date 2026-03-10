package com.crm.backend.dto;

import com.crm.backend.model.LeadStatus;
import lombok.Data;

@Data
public class LeadDTO {
    private String name;
    private String contactInfo;
    private String source;
    private LeadStatus status;
    private Long salesRepId;
}
