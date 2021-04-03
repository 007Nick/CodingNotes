package com.example.coaching.Pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "salary")
    private String salary;

    @ManyToOne
    @JoinColumn(name = "organisation_id")
    private OrganisationInfo organisationInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public OrganisationInfo getOrganisationInfo() {
        return organisationInfo;
    }

    public void setOrganisationInfo(OrganisationInfo organisationInfo) {
        this.organisationInfo = organisationInfo;
    }


}
