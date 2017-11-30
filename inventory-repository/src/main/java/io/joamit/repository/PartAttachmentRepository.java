package io.joamit.repository;

import io.joamit.inventory.domain.part.PartAttachment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartAttachmentRepository extends MongoRepository<PartAttachment, String> {
}
