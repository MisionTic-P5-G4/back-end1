package com.guarderia.products_ms.controllers;

import com.guarderia.products_ms.exceptions.ProductNotFoundException;
import com.guarderia.products_ms.models.Product;
import com.guarderia.products_ms.repositories.ProductsRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private final ProductsRepository productsRepository;

    public ProductController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping("/product/{id}")
    Product getProduct(@PathVariable String id){
        return productsRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("No se encontro el producto con id: " + id));
    }

    @PostMapping("/product")
    Product newProduct(@RequestBody Product product){
        return productsRepository.save(product);
    }
}
