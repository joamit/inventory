package io.joamit.inventory.repository.storage;

import io.joamit.inventory.domain.storage.StorageLocation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StorageLocationRepository extends MongoRepository<StorageLocation, String> {
}
