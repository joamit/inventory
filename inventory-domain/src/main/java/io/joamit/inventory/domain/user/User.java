package io.joamit.inventory.domain.user;

import io.joamit.inventory.domain.BaseDocument;

import java.util.Date;

public class User extends BaseDocument {

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
