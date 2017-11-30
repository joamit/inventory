package io.joamit.repository;

import io.joamit.inventory.domain.category.PartCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartCategoryRepository extends MongoRepository<PartCategory, String> {
}
