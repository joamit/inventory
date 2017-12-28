package io.joamit.inventory.domain.user;

import io.joamit.inventory.domain.BaseDocument;

/**
 * Holds information about the user type
 */
public class UserProvider extends BaseDocument {

    /**
     * Type of user i.e. internal/external/manufacturer/distributor
     */
    private UserType type;

    /**
     * If user information is editable or not
     */
    private Boolean editable;

    public UserProvider() {
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }
}
