package com.guarderia.products_ms.repositories;

import com.guarderia.products_ms.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository <Product, Integer> {

}
