package io.joamit.inventory.service.repository.misc;

import io.joamit.inventory.domain.misc.SiPrefix;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "siPrefix", path = "siPrefix")
public interface SiPrefixRepository extends MongoRepository<SiPrefix, String> {
}
