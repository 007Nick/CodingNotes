package com.example.coaching.Pojos.response;

import com.example.coaching.Pojos.Profile;
import com.example.coaching.Pojos.Status;

public class ProfileAddResponse extends Status {
    private Profile profile;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
