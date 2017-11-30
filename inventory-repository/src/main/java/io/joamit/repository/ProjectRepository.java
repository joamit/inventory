package io.joamit.repository;

import io.joamit.inventory.domain.project.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
