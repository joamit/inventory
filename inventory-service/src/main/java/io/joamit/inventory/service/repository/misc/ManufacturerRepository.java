package io.joamit.inventory.service.repository.misc;

import io.joamit.inventory.domain.misc.Manufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "manufacturer", path = "manufacturer")
public interface ManufacturerRepository extends MongoRepository<Manufacturer, String> {
}
