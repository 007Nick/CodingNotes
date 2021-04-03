package com.example.coaching.Services;

import com.example.coaching.Pojos.UserInfo;
import com.example.coaching.Pojos.response.LoginResponse;
import com.example.coaching.Pojos.response.SignupResponse;
import com.example.coaching.Repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public SignupResponse addUserInfo(UserInfo userInfo) {
        SignupResponse signupResponse = new SignupResponse();
        List<UserInfo> userInfoList = userInfoRepository.findAll();
        for(int i = 0; i< userInfoList.size(); i++) {
            UserInfo currUser = userInfoList.get(i);
            if(currUser.getEmail().equals(userInfo.getEmail())) {
                signupResponse.setStatus(false);
                signupResponse.setError("Email Id already exists.");
                return signupResponse;
            }
            else if(currUser.getUserName().equals(userInfo.getUserName())) {
                signupResponse.setStatus(false);
                signupResponse.setError("User name already exists.");
                return signupResponse;
            }
        }
        signupResponse.setStatus(true);
        userInfoRepository.save(userInfo);
        signupResponse.setUserInfo(userInfo);
        signupResponse.getUserInfo().setPassword("*****");
        return signupResponse;
    }

    @Override
    public LoginResponse loginUser(String userName, String password) {
        LoginResponse loginResponse = new LoginResponse();
        List<UserInfo> userInfoList = userInfoRepository.findAll();
        for(int i = 0; i< userInfoList.size(); i++) {
            UserInfo currUser = userInfoList.get(i);
            if(currUser.getUserName().equals(userName)) {
                if(currUser.getPassword().equals(password)) {
                    loginResponse.setStatus(true);
                    currUser.setPassword("*****");
                    loginResponse.setUserInfo(currUser);
                } else {
                    loginResponse.setStatus(false);
                    loginResponse.setError("Wrong password");
                }
                return loginResponse;
            }
        }
        loginResponse.setError("User name does not exist");
        loginResponse.setStatus(false);
        return loginResponse;
    }
}
