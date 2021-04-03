package com.example.coaching.Services;

import com.example.coaching.Pojos.OrganisationInfo;
import com.example.coaching.Pojos.request.OrganisationVerifyRequest;
import com.example.coaching.Pojos.response.OrganisationVerifyResponse;

public interface OrganisationService {

    OrganisationVerifyResponse verifyOrg(OrganisationVerifyRequest request);
    OrganisationInfo getOrgInfo(Integer orgId);
}
