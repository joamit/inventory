package io.joamit.inventory.repository.misc;

import io.joamit.inventory.domain.misc.StockEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockEntryRepository extends MongoRepository<StockEntry, String> {
}
