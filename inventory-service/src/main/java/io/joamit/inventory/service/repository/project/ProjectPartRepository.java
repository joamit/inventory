package io.joamit.inventory.service.repository.project;

import io.joamit.inventory.domain.project.ProjectPart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectPartRepository extends MongoRepository<ProjectPart, String> {
}
