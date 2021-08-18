package com.example.resumegenerator.service;

import com.example.resumegenerator.model.Education;
import com.example.resumegenerator.model.Experience;
import com.example.resumegenerator.model.ResumeInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {
    public void generateResume(ResumeInfo resumeInfo) {
        System.out.println("*********************************************************");
        System.out.println(resumeInfo.getName());
        System.out.println("*********************************************************");
        System.out.println("*********************************************************");
        System.out.println("Contact Info");
        System.out.println("---------------------------------------------------------");
        System.out.println("Address: " + resumeInfo.getAddress());
        System.out.println("Phone Number: " + resumeInfo.getPhoneNumber());
        System.out.println("Email: " + resumeInfo.getEmail());
        System.out.println("*********************************************************");
        System.out.println("*********************************************************");
        List<Education> educations = resumeInfo.getEducations();
        if (!educations.isEmpty() && educations != null) {
            System.out.println("Education");
            System.out.println("---------------------------------------------------------");
            educations.forEach(education -> {
                System.out.println("Degree: " + education.getDegree());
                System.out.println("School: " + education.getSchoolName());
                System.out.println("Duration: " + education.getDuration());
                System.out.println();
            });
            System.out.println("*********************************************************");
            System.out.println("*********************************************************");
        }

        List<Experience> experiences = resumeInfo.getExperiences();
        if (!experiences.isEmpty() && experiences != null) {
            System.out.println("Experience");
            System.out.println("---------------------------------------------------------");
            experiences.forEach(experience -> {
                System.out.println("Job Title: " + experience.getJobTitle());
                System.out.println("Company: " + experience.getCompanyName());
                List<String> responsibilities = experience.getResponsibilities();
                if (!responsibilities.isEmpty() && responsibilities != null) {
                    System.out.println("Responsibilities:");
                    responsibilities.forEach(responsibility -> {
                        System.out.println("* " + responsibility);
                    });

                }
                System.out.println();
            });
            System.out.println("*********************************************************");
            System.out.println("*********************************************************");
        }

        List<String> skills = resumeInfo.getSkills();
        if (!skills.isEmpty() & skills != null) {
            System.out.println("Skills");
            System.out.println("---------------------------------------------------------");
            skills.forEach(skill -> {
                System.out.println("* " + skill);
                System.out.println();
            });
            System.out.println("*********************************************************");
            System.out.println("*********************************************************");
        }

    }
}
