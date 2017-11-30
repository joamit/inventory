package io.joamit.repository;

import io.joamit.inventory.domain.part.StockEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockEntryRepository extends MongoRepository<StockEntry, String> {
}
