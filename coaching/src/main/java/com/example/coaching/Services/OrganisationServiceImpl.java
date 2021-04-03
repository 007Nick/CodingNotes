package com.example.coaching.Services;

import com.example.coaching.Pojos.OrganisationInfo;
import com.example.coaching.Pojos.Profile;
import com.example.coaching.Pojos.request.OrganisationVerifyRequest;
import com.example.coaching.Pojos.response.OrganisationVerifyResponse;
import com.example.coaching.Repository.OrganisationInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganisationServiceImpl implements OrganisationService{

    @Autowired
    OrganisationInfoRepository organisationInfoRepository;

    @Override
    public OrganisationVerifyResponse verifyOrg(OrganisationVerifyRequest request) {
        OrganisationVerifyResponse response = new OrganisationVerifyResponse();
        organisationInfoRepository.save(request.getOrganisationInfo());
        response.setOrganisationInfo(request.getOrganisationInfo());
        response.setStatus(true);
        return response;
    }

    @Override
    public OrganisationInfo getOrgInfo(Integer orgId) {
        OrganisationInfo organisationInfo =  organisationInfoRepository.findById(orgId).get();
        organisationInfo.getUserInfo().setOrganisationInfo(null);
        for(int i = 0; i<organisationInfo.getProfileList().size() ;i++) {
            Profile profile = organisationInfo.getProfileList().get(i);
            profile.setOrganisationInfo(null);
        }
        return organisationInfo;
    }


}
