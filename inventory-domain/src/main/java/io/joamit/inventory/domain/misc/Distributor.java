package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;

/**
 * Inventory part distributor domain model
 */
public class Distributor extends BaseDocument {

    /**
     * Holds information about the Name of the distributor
     */
    private String name;

    /**
     * Holds information about the address of the distributor
     * TODO: move it to a separate Address object
     */
    private String address;

    /**
     * Holds information about the website url of the distributor (optional)
     */
    private String url;

    /**
     * Holds information about the phone number of the distributor
     */
    private String phone;

    /**
     * Holds information about the fax details of the distributor
     */
    private String fax;

    /**
     * Holds information about the email of the distributor
     */
    private String email;

    /**
     * Holds information about the SKU Url of the distributor
     */
    private String stockKeepingUnitUrl;

    /**
     * can this distributor can be included in the reports??
     */
    private Boolean enabledForReports = true;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStockKeepingUnitUrl() {
        return stockKeepingUnitUrl;
    }

    public void setStockKeepingUnitUrl(String stockKeepingUnitUrl) {
        this.stockKeepingUnitUrl = stockKeepingUnitUrl;
    }

    public Boolean getEnabledForReports() {
        return enabledForReports;
    }

    public void setEnabledForReports(Boolean enabledForReports) {
        this.enabledForReports = enabledForReports;
    }
}
