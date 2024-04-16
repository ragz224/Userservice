package com.userservice.Dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class SignupRequestDto {
    private String name;
    private String email;
    private String password;
    private String role;
}
