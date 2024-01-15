package org.example.web;

import org.example.model.dto.UserRegisterDto;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserRegistrationController {

    private final UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(){
        return "auth-register";
    }

    @PostMapping("/register")
    public String register(UserRegisterDto userRegisterDto){

        if (userRegisterDto.password().equals(userRegisterDto.confirmPassword())){
            userService.registerUser(userRegisterDto);
            return "redirect:/";
        }

        return "redirect:/users/register";
    }
}
