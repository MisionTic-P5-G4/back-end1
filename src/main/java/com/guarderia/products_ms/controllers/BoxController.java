package com.guarderia.products_ms.controllers;

import com.guarderia.products_ms.models.Box;
import com.guarderia.products_ms.services.CounterGeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.guarderia.products_ms.repositories.BoxRepository;

import java.util.List;

@RestController
public class BoxController {
    private BoxRepository boxRepository;
    private CounterGeneratorService service;

    public BoxController(BoxRepository boxRepository, CounterGeneratorService service) {
        this.boxRepository = boxRepository;
        this.service = service;
    }


    @PostMapping("/box")
    public Box save(@RequestBody Box box){
        box.setId(service.getSequenceNumber(Box.SEQUENCE_NAME));
        return boxRepository.save(box);
    }

    @GetMapping("/boxes")
    public List<Box> getBoxes(){
        return boxRepository.findAll();
    }

}
