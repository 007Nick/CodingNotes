package com.example.coaching.Services;

import com.example.coaching.Pojos.Profile;
import com.example.coaching.Pojos.request.ProfileAddRequest;
import com.example.coaching.Pojos.response.ProfileAddResponse;

import java.util.List;

public interface ProfileService {
    ProfileAddResponse addProfile(ProfileAddRequest profileAddRequest);
    List<Profile> getAllProfiles(Integer orgId);
}
