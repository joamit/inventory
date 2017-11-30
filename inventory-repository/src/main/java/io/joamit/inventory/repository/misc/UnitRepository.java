package io.joamit.inventory.repository.misc;

import io.joamit.inventory.domain.misc.Unit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UnitRepository extends MongoRepository<Unit, String> {
}
