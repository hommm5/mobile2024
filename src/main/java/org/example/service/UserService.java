package org.example.service;

import org.example.model.dto.UserLoginDto;
import org.example.model.dto.UserRegisterDto;

public interface UserService {

    void registerUser(UserRegisterDto userRegisterDto);
    boolean loginUser(UserLoginDto userLoginDto);

    void logOutUser();
}
