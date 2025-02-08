package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @Valid
    @NotNull(message = "Location cannot be empty")
    @Size(max = 100, message = "Location should not exceed 100 characters")
    private String location;

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public List<job> getJobs() {
//        return jobs;
//    }
//
//    public void setJobs(List<Job> jobs) {
//        this.jobs = jobs;
//    }
}
