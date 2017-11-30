package io.joamit.repository;

import io.joamit.inventory.domain.footprint.FootprintImage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FootprintImageRepository extends MongoRepository<FootprintImage, String> {
}
