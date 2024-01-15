package org.example.model.dto;

public record UserRegisterDto(String firstName,
                              String lastName,
                              String email,
                              String password,
                              String confirmPassword) {

}
