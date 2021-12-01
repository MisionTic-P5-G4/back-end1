package com.guarderia.products_ms.repositories;

import com.guarderia.products_ms.models.Box;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoxRepository extends MongoRepository<Box,Integer> {

}
