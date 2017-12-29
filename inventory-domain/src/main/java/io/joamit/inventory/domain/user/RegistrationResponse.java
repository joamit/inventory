package io.joamit.inventory.domain.user;

public class RegistrationResponse {

    private Boolean success;

    private String message;

    public RegistrationResponse() {
        this.success = false;
        this.message = "";
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
