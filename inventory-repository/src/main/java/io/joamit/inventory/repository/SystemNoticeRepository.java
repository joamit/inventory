package io.joamit.inventory.repository;

import io.joamit.inventory.domain.SystemNotice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SystemNoticeRepository extends MongoRepository<SystemNotice, String> {
}
