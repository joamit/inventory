package io.joamit.inventory.repository.footprint;

import io.joamit.inventory.domain.footprint.FootprintCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "footprintCategory", path = "footprintCategory")
public interface FootprintCategoryRepository extends MongoRepository<FootprintCategory, String> {
}
