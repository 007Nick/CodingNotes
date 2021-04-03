package com.example.coaching.Controllers;

import com.example.coaching.Pojos.OrganisationInfo;
import com.example.coaching.Pojos.request.OrganisationVerifyRequest;
import com.example.coaching.Pojos.response.OrganisationVerifyResponse;
import com.example.coaching.Services.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrganisationController {

    @Autowired
    OrganisationService organisationService;

    @PostMapping("/verifyOrg")
    public OrganisationVerifyResponse verifyOrg(@RequestBody OrganisationVerifyRequest request) {
        OrganisationVerifyResponse response = organisationService.verifyOrg(request);
        return response;
    }

    @GetMapping("/getOrg")
    public OrganisationInfo getOrg(@RequestParam Integer orgId) {
        OrganisationInfo organisationInfo = organisationService.getOrgInfo(orgId);
        return organisationInfo;
    }
}
