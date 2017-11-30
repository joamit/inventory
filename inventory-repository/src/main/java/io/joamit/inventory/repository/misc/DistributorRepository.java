package io.joamit.inventory.repository.misc;

import io.joamit.inventory.domain.misc.Distributor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DistributorRepository extends MongoRepository<Distributor, String> {
}
