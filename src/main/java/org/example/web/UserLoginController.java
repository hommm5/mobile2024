package org.example.web;


import org.example.model.dto.UserLoginDto;
import org.example.service.UserService;
import org.example.util.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserLoginController {

    private final UserService userService;
    private final CurrentUser currentUser;

    public UserLoginController(UserService userService, CurrentUser currentUser) {
        this.userService = userService;
        this.currentUser = currentUser;
    }

    @GetMapping("/users/login")
    public String login(){
        return "auth-login";
    }

    @PostMapping("/users/login")
    public String login(UserLoginDto userLoginDto){
        boolean loginSuccessful = userService.loginUser(userLoginDto);

        return loginSuccessful ? "redirect:/": "auth-login";
    }

    @GetMapping("users/logout")
    public String logout(){
        if (currentUser.isLogged()){
            userService.logOutUser();
        }
        return "redirect:/";

    }
}
