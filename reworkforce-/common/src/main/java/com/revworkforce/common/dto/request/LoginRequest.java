package com.revworkforce.common.dto.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    @JsonAlias({"identifier", "email"})
    @NotBlank(message = "Identifier (Email or Employee ID) is required")
    private String identifier;
    @NotBlank(message = "Password is required")
    private String password;
}
