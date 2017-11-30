package io.joamit.inventory.repository.user;

import io.joamit.inventory.domain.user.UserProvider;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProviderRepository extends MongoRepository<UserProvider, String> {
}
