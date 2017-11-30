package io.joamit.inventory.service.repository.part;

import io.joamit.inventory.domain.part.PartCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartCategoryRepository extends MongoRepository<PartCategory, String> {
}
