package com.guarderia.products_ms.controllers;

import com.guarderia.products_ms.exceptions.AlreadyAddedException;
import com.guarderia.products_ms.exceptions.ProductNotFoundException;
import com.guarderia.products_ms.models.Operation;
import com.guarderia.products_ms.services.CounterGeneratorService;
import org.springframework.web.bind.annotation.*;
import com.guarderia.products_ms.repositories.OperationRepository;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OperationController {
    private OperationRepository operationRepository;
    private CounterGeneratorService service;

    public OperationController(OperationRepository operationRepository, CounterGeneratorService service) {
        this.operationRepository = operationRepository;
        this.service = service;
    }


    @PostMapping("/item")
    public Operation save(@RequestBody Operation operation){
        List<Operation> userProducts = operationRepository.findByUserId(operation.getUserId());

        List<Operation> userPrdctsFiltered = new ArrayList<Operation>();
        for (Operation operation1: userProducts) {
            if ( operation1.getProductId() == operation.getProductId())
                userPrdctsFiltered.add(operation1);
        }

        if (!userPrdctsFiltered.isEmpty())
            throw new AlreadyAddedException("The product "+ operation.getProductId() + "Was already added");

        operation.setId(service.getSequenceNumber(Operation.SEQUENCE_NAME));
        return operationRepository.save(operation);
    }

    @GetMapping("/items/{id}")
    public List<Operation> getItems(@PathVariable Integer id){
        return operationRepository.findByUserId(id);
    }

    @GetMapping("/item/{userId}/{productId}")
    public Operation getItem(@PathVariable Integer userId, @PathVariable Integer productId){
        List<Operation> userProducts = operationRepository.findByUserId(userId);
        Operation mine = null;
        for (Operation operation1: userProducts) {
            if ( operation1.getProductId() == productId)
                mine = operation1;
        }

        if (mine == null)
            throw new ProductNotFoundException("the product "+ productId + "Was not found in user " + userId + ".");

        return mine;
    }

}
