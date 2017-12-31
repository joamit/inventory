package io.joamit.inventory.config;

import io.joamit.inventory.domain.user.User;
import io.joamit.inventory.exception.UserAuthenticationFailedException;
import io.joamit.inventory.exception.WrongPasswordException;
import io.joamit.inventory.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AuthManager implements AuthenticationManager {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        Optional<User> optionalUser = userRepository.findByUsername(authentication.getPrincipal().toString());
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            Boolean passwordMatches = new BCryptPasswordEncoder().matches(String.valueOf(authentication.getCredentials()), user.getPassword());
            if (passwordMatches) {
                List<GrantedAuthority> authorities = new ArrayList<>();
                //TODO: populate authorities from roleRepo
                authorities.add(new SimpleGrantedAuthority("ADMIN"));
                authorities.add(new SimpleGrantedAuthority("ACTUATOR"));
                authorities.add(new SimpleGrantedAuthority("OPERATIONS"));
                return new UsernamePasswordAuthenticationToken(authentication.getPrincipal(), authentication.getCredentials(), authorities);
            } else {
                throw new WrongPasswordException(String.valueOf(authentication.getPrincipal()));
            }
        } else {
            throw new UserAuthenticationFailedException(String.valueOf(authentication.getPrincipal()));
        }
    }
}
