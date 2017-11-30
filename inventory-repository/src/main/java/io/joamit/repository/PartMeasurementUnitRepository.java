package io.joamit.repository;

import io.joamit.inventory.domain.part.PartMeasurementUnit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartMeasurementUnitRepository extends MongoRepository<PartMeasurementUnit, String> {
}
