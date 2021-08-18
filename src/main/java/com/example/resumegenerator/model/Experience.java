package com.example.resumegenerator.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Experience {
    private String jobTitle;
    private String companyName;
    private List<String> responsibilities;

}
