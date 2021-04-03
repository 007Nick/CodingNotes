package com.example.coaching.Services;

import com.example.coaching.Pojos.Profile;
import com.example.coaching.Pojos.request.ProfileAddRequest;
import com.example.coaching.Pojos.response.ProfileAddResponse;
import com.example.coaching.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    ProfileRepository profileRepository;

    @Override
    public ProfileAddResponse addProfile(ProfileAddRequest profileAddRequest) {
        ProfileAddResponse response = new ProfileAddResponse();
        Profile profile = profileRepository.save(profileAddRequest.getProfile());
        profile.setOrganisationInfo(null);
        response.setProfile(profile);
        if(profile != null) {
            response.setStatus(true);
        }
        return response;
    }

    @Override
    public List<Profile> getAllProfiles(Integer orgId) {
        List<Profile> profileList = profileRepository.findAll();
        List<Profile> orgProfileList = new ArrayList<>();
        for(int i = 0; i<profileList.size() ;i++) {
            Profile currProfile = profileList.get(i);
            if(currProfile.getOrganisationInfo().getId() == orgId) {
                currProfile.setOrganisationInfo(null);
                orgProfileList.add(currProfile);
            }
        }
        return orgProfileList;
    }
}
