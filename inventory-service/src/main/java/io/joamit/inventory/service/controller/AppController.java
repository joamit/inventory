package io.joamit.inventory.service.controller;

import io.joamit.inventory.domain.user.User;
import io.joamit.inventory.domain.user.UserBuilder;
import io.joamit.inventory.domain.user.UserProvider;
import io.joamit.inventory.domain.user.UserType;
import io.joamit.inventory.service.exception.UserAlreadyExistsException;
import io.joamit.inventory.service.repository.user.UserProviderRepository;
import io.joamit.inventory.service.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Optional;

@Controller
public class AppController {

    @Autowired
    private UserProviderRepository userProviderRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("username") String username,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password) {

        UserProvider provider;

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

        if(optionalUser.isPresent()){
            throw new UserAlreadyExistsException();
        }

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

        return null;
    }
}
