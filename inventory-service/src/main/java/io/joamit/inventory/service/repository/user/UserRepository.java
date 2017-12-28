package io.joamit.inventory.service.repository.user;

import io.joamit.inventory.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsernameAndEmail(String username, String email);

    Optional<User> findByUsername(String username);
}
