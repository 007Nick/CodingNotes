package com.example.coaching.Pojos.response;

import com.example.coaching.Pojos.OrganisationInfo;
import com.example.coaching.Pojos.Status;

public class OrganisationVerifyResponse extends Status {
    private OrganisationInfo organisationInfo;

    public OrganisationInfo getOrganisationInfo() {
        return organisationInfo;
    }

    public void setOrganisationInfo(OrganisationInfo organisationInfo) {
        this.organisationInfo = organisationInfo;
    }
}
