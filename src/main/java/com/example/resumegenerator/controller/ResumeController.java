package com.example.resumegenerator.controller;

import com.example.resumegenerator.service.ResumeService;
import com.example.resumegenerator.model.ResumeInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resume")
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeService resumeService;

    @PostMapping
    public ResponseEntity<?> generateResume(ResumeInfo resumeInfo) {
        resumeService.generateResume(resumeInfo);
        return new ResponseEntity<>(resumeInfo, HttpStatus.CREATED);
    }
}
