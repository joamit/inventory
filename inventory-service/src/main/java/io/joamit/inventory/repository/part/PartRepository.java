package io.joamit.inventory.repository.part;

import io.joamit.inventory.domain.part.Part;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartRepository extends MongoRepository<Part, String> {
}
