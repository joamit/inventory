package io.joamit.inventory.repository.misc;

import io.joamit.inventory.domain.misc.StockEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "stockEntry", path = "stockEntry")
public interface StockEntryRepository extends MongoRepository<StockEntry, String> {
}
