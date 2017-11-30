package io.joamit.inventory.repository.user;

import io.joamit.inventory.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
