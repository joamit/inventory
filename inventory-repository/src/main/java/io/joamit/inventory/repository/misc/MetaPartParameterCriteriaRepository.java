package io.joamit.inventory.repository.misc;

import io.joamit.inventory.domain.misc.MetaPartParameterCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MetaPartParameterCriteriaRepository extends MongoRepository<MetaPartParameterCriteria, String> {
}
