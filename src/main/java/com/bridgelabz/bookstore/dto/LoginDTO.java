package com.bridgelabz.bookstore.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor

public class LoginDTO {
    private String loginID;
    private String password;
}