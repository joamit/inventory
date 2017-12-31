package io.joamit.inventory.repository.misc;

import io.joamit.inventory.domain.misc.MetaPartParameterCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "metaPartParameterCriteria", path = "metaPartParameterCriteria")
public interface MetaPartParameterCriteriaRepository extends MongoRepository<MetaPartParameterCriteria, String> {
}
