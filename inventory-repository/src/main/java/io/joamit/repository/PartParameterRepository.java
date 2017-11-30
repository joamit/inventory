package io.joamit.repository;

import io.joamit.inventory.domain.part.PartParameter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartParameterRepository extends MongoRepository<PartParameter, String> {
}
