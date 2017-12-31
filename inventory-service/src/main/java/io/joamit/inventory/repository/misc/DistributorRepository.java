package io.joamit.inventory.repository.misc;

import io.joamit.inventory.domain.misc.Distributor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "distributor", path = "distributor")
public interface DistributorRepository extends MongoRepository<Distributor, String> {
}
