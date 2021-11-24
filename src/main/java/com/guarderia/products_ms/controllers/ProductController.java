package com.guarderia.products_ms.controllers;

import com.guarderia.products_ms.exceptions.ProductNotFoundException;
import com.guarderia.products_ms.models.Product;
import com.guarderia.products_ms.repositories.ProductsRepository;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductsRepository productsRepository;

    public ProductController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping("/product/{id}")
    Product getProduct(@PathVariable String id){
        return productsRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("No se encontro el producto con id: " + id));
    }

    @GetMapping("/products/")
    List<Product> getAllProducts(){
        return productsRepository.findAll();
    }

    @PostMapping("/product")
    Product newProduct(@RequestBody Product product){
        return productsRepository.save(product);
    }

    @PutMapping("/product/{id}")
    Product modifyProduct(@RequestBody Product product, @PathVariable String id){
        Product mio = productsRepository.findById(id)
                .orElse(null);
        if (mio == null)
            throw  new ProductNotFoundException("No se encontro el producto con id: " + id);

        product.setId(Integer.parseInt(id));
        return productsRepository.save(product);
    }

    @DeleteMapping("product/{id}")
    String deleteProduct(@PathVariable String id){
        Product mio = productsRepository.findById(id)
                        .orElse(null);
        if (mio == null)
            throw  new ProductNotFoundException("No se encontro el producto con id: " + id);

        productsRepository.deleteById(id);
        return "producto eliminado";
    }

}
