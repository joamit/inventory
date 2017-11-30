package io.joamit.inventory.service.repository.part;

import io.joamit.inventory.domain.part.PartParameter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartParameterRepository extends MongoRepository<PartParameter, String> {
}
