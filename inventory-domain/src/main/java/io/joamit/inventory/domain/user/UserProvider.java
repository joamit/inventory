package io.joamit.inventory.domain.user;

import io.joamit.inventory.domain.BaseDocument;

public class UserProvider extends BaseDocument {

    private String type;

    private Boolean editable;

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
