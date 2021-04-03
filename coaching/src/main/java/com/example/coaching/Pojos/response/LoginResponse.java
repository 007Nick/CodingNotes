package com.example.coaching.Pojos.response;

import com.example.coaching.Pojos.Status;
import com.example.coaching.Pojos.UserInfo;

public class LoginResponse extends Status {
    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
