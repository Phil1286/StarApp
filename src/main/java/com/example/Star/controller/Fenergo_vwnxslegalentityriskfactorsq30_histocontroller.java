package com.example.Star.controller;


import com.example.Star.model.Fenergo_vwnxslegalentityriskfactorsq30_histo;
import com.example.Star.repository.Fenergo_vwnxslegalentityriskfactorsq30_histoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping
public class Fenergo_vwnxslegalentityriskfactorsq30_histocontroller {

    @Autowired
    private Fenergo_vwnxslegalentityriskfactorsq30_histoRepository fenergo_vwnxslegalentityriskfactorsq30_histoRepository;

    @GetMapping("/Fenergo")
    public List<Object> getAllBooks() {

        return fenergo_vwnxslegalentityriskfactorsq30_histoRepository.findAllActhistoNative();
    }

}
