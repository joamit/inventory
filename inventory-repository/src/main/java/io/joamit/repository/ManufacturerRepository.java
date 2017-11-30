package io.joamit.repository;

import io.joamit.inventory.domain.part.Manufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManufacturerRepository extends MongoRepository<Manufacturer, String> {
}
