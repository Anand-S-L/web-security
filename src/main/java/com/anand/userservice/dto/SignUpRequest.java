package com.anand.userservice.dto;

import lombok.Data;

@Data
public class SignUpRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
}
