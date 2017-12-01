package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;

/**
 * Part Manufacturer details
 */
public class Manufacturer extends BaseDocument {

    /**
     * Holds information about the Name of the manufacturer
     */
    private String name;

    /**
     * Holds information about the address of the manufacturer
     */
    private String address;

    /**
     * Holds information about the website url of the manufacturer
     */
    private String url;

    /**
     * Holds information about the email of the manufacturer
     */
    private String email;

    /**
     * Holds information about any miscellaneous details of the manufacturer
     */
    private String comment;

    /**
     * Holds information about the phone details of the manufacturer
     */
    private String phone;

    /**
     * Holds information about the fax details of the manufacturer
     */
    private String fax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
