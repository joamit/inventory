package io.joamit.inventory.domain.user;

import java.util.Date;

/**
 * Helper builder to create new user instances
 */
public final class UserBuilder {
    private String username;
    private String password;
    private String newPassword;
    private String email;
    private Boolean admin;
    private Boolean legacy;
    private Date lastSeen;
    private String initialUserPreferences;
    private UserProvider userProvider;
    private Boolean active;
    private boolean protectedUser;

    /**
     * Builder's default constructor should be private, use static instance creator instead
     */
    private UserBuilder() {
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder withAdmin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    public UserBuilder withLegacy(Boolean legacy) {
        this.legacy = legacy;
        return this;
    }

    public UserBuilder withLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    public UserBuilder withInitialUserPreferences(String initialUserPreferences) {
        this.initialUserPreferences = initialUserPreferences;
        return this;
    }

    public UserBuilder withUserProvider(UserProvider userProvider) {
        this.userProvider = userProvider;
        return this;
    }

    public UserBuilder withActive(Boolean active) {
        this.active = active;
        return this;
    }

    public UserBuilder withProtectedUser(boolean protectedUser) {
        this.protectedUser = protectedUser;
        return this;
    }

    public User build() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setNewPassword(newPassword);
        user.setEmail(email);
        user.setAdmin(admin);
        user.setLegacy(legacy);
        user.setLastSeen(lastSeen);
        user.setInitialUserPreferences(initialUserPreferences);
        user.setUserProvider(userProvider);
        user.setActive(active);
        user.setProtectedUser(protectedUser);
        return user;
    }
}
