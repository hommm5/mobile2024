package org.example.service.impl;

import org.example.model.dto.UserLoginDto;
import org.example.model.dto.UserRegisterDto;
import org.example.model.entity.UserEntity;
import org.example.repositories.UserRepository;
import org.example.service.UserService;
import org.example.util.CurrentUser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.currentUser = currentUser;
    }

    @Override
    public void registerUser(UserRegisterDto userRegisterDto) {
            userRepository.save(map(userRegisterDto));
    }

    @Override
    public boolean loginUser(UserLoginDto userLoginDto) {

        Optional<UserEntity> userOptional = userRepository.findByEmail(userLoginDto.email());

        if (userOptional.isPresent()){
            UserEntity user = userOptional.get();
            String encodedPass = user.getPassword();
            String rawPass = userLoginDto.password();

            if (passwordEncoder.matches(rawPass, encodedPass)){

                currentUser.setLogged(true);
                currentUser.setFirstName(user.getFirstName());
                currentUser.setLastName(user.getLastName());

                return true;
            }

            return false;
        }

        return false;
    }

    @Override
    public void logOutUser() {
        currentUser.logOut();
    }


    private UserEntity map(UserRegisterDto userRegisterDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userRegisterDto.firstName());
        userEntity.setLastName(userRegisterDto.lastName());
        userEntity.setEmail(userRegisterDto.email());
        userEntity.setPassword(passwordEncoder.encode(userRegisterDto.password()));
        userEntity.setActive(true);
        return userEntity;
    }
}
