package io.joamit.inventory.domain.misc;

/**
 * Helper builder class to create a distributor instance
 */
public final class DistributorBuilder {
    private String name;
    private String address;
    private String url;
    private String phone;
    private String fax;
    private String email;
    private String stockKeepingUnitUrl;
    private Boolean enabledForReports = true;

    /**
     * Builder's default constructor should be private, use the static method to create an instance
     */
    private DistributorBuilder() {
    }

    public static DistributorBuilder aDistributor() {
        return new DistributorBuilder();
    }

    public DistributorBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public DistributorBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public DistributorBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public DistributorBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public DistributorBuilder withFax(String fax) {
        this.fax = fax;
        return this;
    }

    public DistributorBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public DistributorBuilder withStockKeepingUnitUrl(String stockKeepingUnitUrl) {
        this.stockKeepingUnitUrl = stockKeepingUnitUrl;
        return this;
    }

    public DistributorBuilder withEnabledForReports(Boolean enabledForReports) {
        this.enabledForReports = enabledForReports;
        return this;
    }

    public Distributor build() {
        Distributor distributor = new Distributor();
        distributor.setName(name);
        distributor.setAddress(address);
        distributor.setUrl(url);
        distributor.setPhone(phone);
        distributor.setFax(fax);
        distributor.setEmail(email);
        distributor.setStockKeepingUnitUrl(stockKeepingUnitUrl);
        distributor.setEnabledForReports(enabledForReports);
        return distributor;
    }
}
