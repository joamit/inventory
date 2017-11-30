package io.joamit.inventory.repository.footprint;

import io.joamit.inventory.domain.footprint.FootprintAttachment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FootprintAttachmentRepository extends MongoRepository<FootprintAttachment, String> {
}
