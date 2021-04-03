package com.example.coaching.Controllers;

import com.example.coaching.Pojos.UserInfo;
import com.example.coaching.Pojos.request.LoginRequest;
import com.example.coaching.Pojos.request.SignupRequest;
import com.example.coaching.Pojos.response.LoginResponse;
import com.example.coaching.Pojos.response.SignupResponse;
import com.example.coaching.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/index")
    public String index() {
        return "Application is Healthy";
    }

    @PostMapping("/signup")
    public SignupResponse signupUser(@RequestBody SignupRequest signupRequest) {
        SignupResponse signupResponse = loginService.addUserInfo(signupRequest.getUserInfo());
        return signupResponse;
    }

    @PostMapping("/login")
    public LoginResponse loginUser(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = loginService.loginUser(loginRequest.getUserName(), loginRequest.getPassword());
        return loginResponse;
    }

}
