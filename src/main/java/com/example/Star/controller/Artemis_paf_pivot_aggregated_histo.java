package com.example.Star.controller;


import com.example.Star.repository.Artemis_paf_pivot_aggregated_histoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class Artemis_paf_pivot_aggregated_histo {
    @Autowired
    private Artemis_paf_pivot_aggregated_histoRepository artemis_paf_pivot_aggregated_histoRepository;

    @GetMapping("/artemispafpivot")
    public List<Object> getAllBooks() {

        return  artemis_paf_pivot_aggregated_histoRepository.findAllActivehistoNative();
    }

}
