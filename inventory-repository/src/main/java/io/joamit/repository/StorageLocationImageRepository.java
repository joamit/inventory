package io.joamit.repository;

import io.joamit.inventory.domain.storage.StorageLocationImage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StorageLocationImageRepository extends MongoRepository<StorageLocationImage, String> {
}
