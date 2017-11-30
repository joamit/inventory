package io.joamit.repository;

import io.joamit.inventory.domain.part.Unit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UnitRepository extends MongoRepository<Unit, String> {
}
