package com.pm.authservice.dto;

public class LoginResponseDTO {
    private final String token;

    //Note: Because it is just one variable, constructor is a cleaner approach
    public LoginResponseDTO(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
