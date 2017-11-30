package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseDocument;

public class Distributor extends BaseDocument {

    private String name;

    private String address;

    private String url;

    private String phone;

    private String fax;

    private String email;

    private String stockKeepingUnitUrl;

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
