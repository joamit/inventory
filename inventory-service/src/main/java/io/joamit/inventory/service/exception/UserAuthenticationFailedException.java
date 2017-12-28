package io.joamit.inventory.service.exception;

public class UserAuthenticationFailedException extends RuntimeException {

    public UserAuthenticationFailedException(String message) {
        super(message);
    }
}
