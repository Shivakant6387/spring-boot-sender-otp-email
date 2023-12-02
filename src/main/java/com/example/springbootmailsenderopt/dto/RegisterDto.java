package com.example.springbootmailsenderopt.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterDto {
    private String name;
    private String email;
    private String password;
}
