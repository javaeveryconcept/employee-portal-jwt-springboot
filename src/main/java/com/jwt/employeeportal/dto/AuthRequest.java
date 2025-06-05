package com.jwt.employeeportal.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(name = "LoginRequest", description = "User login credentials")
public class AuthRequest {

    @Schema(description = "User email", example = "john@example.com")
    private String email;

    @Schema(description = "User password", example = "password123")
    private String password;
}

