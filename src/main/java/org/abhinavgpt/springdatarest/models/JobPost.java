package org.abhinavgpt.springdatarest.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String postProfile;
    private String postDescription;
    private int reqExperience;
    @ElementCollection
    private List<String> skills;

    public JobPost() {
    }

    public JobPost(String postProfile, String postDescription, int reqExperience, List<String> skills) {
        this.postProfile = postProfile;
        this.postDescription = postDescription;
        this.reqExperience = reqExperience;
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public int getReqExperience() {
        return reqExperience;
    }

    public void setReqExperience(int reqExperience) {
        this.reqExperience = reqExperience;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
