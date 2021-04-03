package com.example.coaching.Services;

import com.example.coaching.Pojos.UserInfo;
import com.example.coaching.Pojos.response.LoginResponse;
import com.example.coaching.Pojos.response.SignupResponse;

public interface LoginService {
    SignupResponse addUserInfo(UserInfo userInfo);
    LoginResponse loginUser(String userName, String password);
}
