package io.joamit.inventory.domain.user;

import io.joamit.inventory.domain.BaseDocument;

/**
 * Holds information about the user type
 */
public class UserProvider extends BaseDocument {

    /**
     * Type of user i.e. internal/external/manufacturer/distributor
     */
    private String type;

    /**
     * If user information is editable or not
     */
    private Boolean editable;

    public UserProvider(String type, Boolean editable) {
        this.type = type;
        this.editable = editable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }
}
