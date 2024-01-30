package com.example.Star.controller;

import com.example.Star.repository.Artemis_paf_receptacle_histoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class Artemis_paf_receptacle_histoController {

    @Autowired
    private Artemis_paf_receptacle_histoRepository artemis_paf_receptacle_histoRepository;

    @GetMapping("/pafReceptacle")
    public List<Object> getAllHisto() {

        return artemis_paf_receptacle_histoRepository.findAllActivehistoNative();
    }
}
