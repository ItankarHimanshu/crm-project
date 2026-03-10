package com.crm.backend.dto;

import com.crm.backend.model.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String fullName;
    private String email;
    private String password;
    private Role role;
}
