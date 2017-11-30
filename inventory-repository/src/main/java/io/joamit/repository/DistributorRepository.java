package io.joamit.repository;

import io.joamit.inventory.domain.part.Distributor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DistributorRepository extends MongoRepository<Distributor, String> {
}
