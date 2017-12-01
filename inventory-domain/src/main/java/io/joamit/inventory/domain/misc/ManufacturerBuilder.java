package io.joamit.inventory.domain.misc;

/**
 * Helper builder method for Manufacturer
 */
public final class ManufacturerBuilder {
    private String name;
    private String address;
    private String url;
    private String email;
    private String comment;
    private String phone;
    private String fax;

    /**
     * Builder's default constructor should be private, use the static instance creator instead
     */
    private ManufacturerBuilder() {
    }

    public static ManufacturerBuilder aManufacturer() {
        return new ManufacturerBuilder();
    }

    public ManufacturerBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ManufacturerBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public ManufacturerBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public ManufacturerBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public ManufacturerBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public ManufacturerBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ManufacturerBuilder withFax(String fax) {
        this.fax = fax;
        return this;
    }

    public Manufacturer build() {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setName(name);
        manufacturer.setAddress(address);
        manufacturer.setUrl(url);
        manufacturer.setEmail(email);
        manufacturer.setComment(comment);
        manufacturer.setPhone(phone);
        manufacturer.setFax(fax);
        return manufacturer;
    }
}
