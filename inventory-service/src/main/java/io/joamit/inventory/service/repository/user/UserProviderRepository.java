package io.joamit.inventory.service.repository.user;

import io.joamit.inventory.domain.user.UserProvider;
import io.joamit.inventory.domain.user.UserType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserProviderRepository extends MongoRepository<UserProvider, String> {

    Optional<UserProvider> findByType(UserType type);
}
