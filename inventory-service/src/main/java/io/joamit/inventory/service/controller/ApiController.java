package io.joamit.inventory.service.controller;

import io.joamit.inventory.domain.user.*;
import io.joamit.inventory.service.repository.user.UserProviderRepository;
import io.joamit.inventory.service.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {


    @Autowired
    private UserProviderRepository userProviderRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RegistrationResponse register(@RequestParam("username") String username,
                                         @RequestParam("email") String email,
                                         @RequestParam("password") String password) {

        UserProvider provider;
        RegistrationResponse registrationResponse = new RegistrationResponse();

        Optional<UserProvider> internalProvider = userProviderRepository.findByType(UserType.INTERNAL);

        if (internalProvider.isPresent()) {
            provider = internalProvider.get();
        } else {
            provider = new UserProvider();
            provider.setEditable(true);
            provider.setType(UserType.INTERNAL);
            provider = userProviderRepository.save(provider);
        }

        String encodedPassword = new BCryptPasswordEncoder().encode(password);

        Optional<User> optionalUser = userRepository.findByUsernameAndEmail(username.trim(), email.trim());

        if (optionalUser.isPresent()) {
            registrationResponse.setSuccess(false);
            registrationResponse.setMessage("User Already Exists");
        } else {
            User user = UserBuilder.anUser()
                    .withActive(true)
                    .withAdmin(false)
                    .withEmail(email)
                    .withLegacy(false)
                    .withUsername(username)
                    .withProtectedUser(false)
                    .withLastSeen(new Date())
                    .withUserProvider(provider)
                    .withPassword(encodedPassword)
                    .withNewPassword(encodedPassword)
                    .build();
            userRepository.save(user);
            registrationResponse.setSuccess(true);
        }

        return registrationResponse;
    }
}
