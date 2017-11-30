package io.joamit.inventory.repository.misc;

import io.joamit.inventory.domain.misc.Manufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManufacturerRepository extends MongoRepository<Manufacturer, String> {
}
