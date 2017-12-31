package io.joamit.inventory.repository.part;

import io.joamit.inventory.domain.part.PartAttachment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "partAttachment", path = "partAttachment")
public interface PartAttachmentRepository extends MongoRepository<PartAttachment, String> {
}
