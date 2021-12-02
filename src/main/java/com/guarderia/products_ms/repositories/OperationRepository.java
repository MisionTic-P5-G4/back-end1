package com.guarderia.products_ms.repositories;

import com.guarderia.products_ms.models.Operation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OperationRepository extends MongoRepository<Operation,Integer> {
    List<Operation> findByUserId (Integer userId);
    List<Operation> findByproductId (Integer productId);
}
