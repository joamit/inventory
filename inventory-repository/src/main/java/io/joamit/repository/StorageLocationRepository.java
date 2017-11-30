package io.joamit.repository;

import io.joamit.inventory.domain.storage.StorageLocation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StorageLocationRepository extends MongoRepository<StorageLocation, String> {
}
