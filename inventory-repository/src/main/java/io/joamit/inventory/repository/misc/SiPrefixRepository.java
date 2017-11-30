package io.joamit.inventory.repository.misc;

import io.joamit.inventory.domain.misc.SiPrefix;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SiPrefixRepository extends MongoRepository<SiPrefix, String> {
}
