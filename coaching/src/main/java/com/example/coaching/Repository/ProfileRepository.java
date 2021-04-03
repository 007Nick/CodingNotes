package com.example.coaching.Repository;

import com.example.coaching.Pojos.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileRepository  extends JpaRepository<Profile, Integer> {

//    @Query(value = "select p from Profile p join OrganisationInfo o as po where po.id = :orgId")
//    List<Profile> getProfilesByOrgId(@Param("orgId") Integer orgId);
}
