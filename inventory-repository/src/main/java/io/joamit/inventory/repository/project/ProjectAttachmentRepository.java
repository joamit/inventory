package io.joamit.inventory.repository.project;

import io.joamit.inventory.domain.project.ProjectAttachment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectAttachmentRepository extends MongoRepository<ProjectAttachment, String> {
}
