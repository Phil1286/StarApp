package com.example.Star.controller;

import com.example.Star.repository.Rs_research_results_related_contentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class Rs_research_results_related_contentController {

    @Autowired
    private Rs_research_results_related_contentRepository rs_research_results_related_contentRepository;

    @GetMapping("/researchResults")
    public List<Object> getAllBooks(String run_id, String run_time) {

        return  rs_research_results_related_contentRepository.findAllActiveUsersNative(run_id,run_time);
    }

}
