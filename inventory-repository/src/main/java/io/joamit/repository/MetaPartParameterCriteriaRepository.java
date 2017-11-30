package io.joamit.repository;

import io.joamit.inventory.domain.part.MetaPartParameterCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MetaPartParameterCriteriaRepository extends MongoRepository<MetaPartParameterCriteria, String> {
}
