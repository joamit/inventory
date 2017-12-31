package io.joamit.inventory.repository.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<MessageRepository, String> {
}
