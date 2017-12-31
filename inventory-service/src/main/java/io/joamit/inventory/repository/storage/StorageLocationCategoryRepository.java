package io.joamit.inventory.repository.storage;

import io.joamit.inventory.domain.storage.StorageLocationCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StorageLocationCategoryRepository extends MongoRepository<StorageLocationCategory, String> {
}
