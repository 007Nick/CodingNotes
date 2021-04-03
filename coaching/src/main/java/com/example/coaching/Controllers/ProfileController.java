package com.example.coaching.Controllers;

import com.example.coaching.Pojos.Profile;
import com.example.coaching.Pojos.request.ProfileAddRequest;
import com.example.coaching.Pojos.response.ProfileAddResponse;
import com.example.coaching.Services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @PostMapping("/addProfile")
    public ProfileAddResponse addProfile(@RequestBody ProfileAddRequest profileAddRequest) {
        ProfileAddResponse response = profileService.addProfile(profileAddRequest);
        return response;
    }

    @GetMapping("/getAllProfiles")
    public List<Profile> getAllProfiles(@RequestParam Integer orgId) {
        List<Profile> profileList = profileService.getAllProfiles(orgId);
        return profileList;
    }
}
