package io.joamit.inventory.service.repository.part;

import io.joamit.inventory.domain.part.PartDistributor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartDistributorRepository extends MongoRepository<PartDistributor, String> {
}
