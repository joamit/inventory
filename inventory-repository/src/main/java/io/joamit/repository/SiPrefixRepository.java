package io.joamit.repository;

import io.joamit.inventory.domain.part.SiPrefix;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SiPrefixRepository extends MongoRepository<SiPrefix, String> {
}
