package io.joamit.inventory.service.repository.footprint;

import io.joamit.inventory.domain.footprint.Footprint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "footprint", path = "footprint")
public interface FootprintRepository extends MongoRepository<Footprint, String> {
}
