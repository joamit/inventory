package io.joamit.inventory.repository.footprint;

import io.joamit.inventory.domain.footprint.FootprintAttachment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "footprintAttachment1", path = "footprintAttachment1")
public interface FootprintAttachmentRepository extends MongoRepository<FootprintAttachment, String> {
}
