package io.joamit.inventory.domain.user;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

/**
 * Holds information about a user of the system
 */
public class User extends BaseDocument {

    /**
     * Holds information about username
     */
    private String username;

    /**
     * Holds information about user's password
     */
    private String password;

    /**
     * Holds information about user's new password, might come in handy when resetting or adding new password
     */
    private String newPassword;

    /**
     * Holds information about user's email address
     */
    private String email;

    /**
     * Holds information about user's admin status
     */
    private Boolean admin;

    /**
     * Holds information about user's legacy status, might come in handy if we want to move to a new auth system
     * in some later point of time
     */
    private Boolean legacy;

    /**
     * Holds information about when user was last seen logged onto the system
     */
    private Date lastSeen;

    /**
     * Holds information about user's preferences, we can store serialized preferences which can later be
     * used to initialize certain properties
     */
    private String initialUserPreferences;

    /**
     * Holds information about user detail provider
     */
    @DBRef
    private UserProvider userProvider;

    /**
     * Holds information about user's active status
     */
    private Boolean active;

    /**
     * Holds information about user's protected status
     */
    private boolean protectedUser;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getLegacy() {
        return legacy;
    }

    public void setLegacy(Boolean legacy) {
        this.legacy = legacy;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getInitialUserPreferences() {
        return initialUserPreferences;
    }

    public void setInitialUserPreferences(String initialUserPreferences) {
        this.initialUserPreferences = initialUserPreferences;
    }

    public UserProvider getUserProvider() {
        return userProvider;
    }

    public void setUserProvider(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public boolean isProtectedUser() {
        return protectedUser;
    }

    public void setProtectedUser(boolean protectedUser) {
        this.protectedUser = protectedUser;
    }
}
