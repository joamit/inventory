package io.joamit.inventory.service.repository.misc;

import io.joamit.inventory.domain.misc.Unit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "unit", path = "unit")
public interface UnitRepository extends MongoRepository<Unit, String> {
}
