package io.joamit.repository;

import io.joamit.inventory.domain.part.Part;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartRepository extends MongoRepository<Part, String> {
}
