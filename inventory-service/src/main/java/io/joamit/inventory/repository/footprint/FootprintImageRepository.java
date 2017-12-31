package io.joamit.inventory.repository.footprint;

import io.joamit.inventory.domain.footprint.FootprintImage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "footprintImage", path = "footprintImage")
public interface FootprintImageRepository extends MongoRepository<FootprintImage, String> {
}
