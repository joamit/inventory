package io.joamit.inventory.service.repository.user;

import io.joamit.inventory.domain.user.MessageAttachment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageAttachmentRepository extends MongoRepository<MessageAttachment, String> {
}
