package io.joamit.inventory.service.repository.part;

import io.joamit.inventory.domain.part.PartManufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartManufacturerRepository extends MongoRepository<PartManufacturer, String> {

}
