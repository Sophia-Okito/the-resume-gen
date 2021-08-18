package com.example.resumegenerator.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
public class ResumeInfo {
    @NotBlank
    private String name;

    @NotBlank
    private String objective;

    @NotBlank
    private String phoneNumber;

    @NotBlank
    private String Email;

    @NotBlank
    private String address;

    private List<Education> educations;
    private List<Experience> experiences;
    private List<String> skills;
}
