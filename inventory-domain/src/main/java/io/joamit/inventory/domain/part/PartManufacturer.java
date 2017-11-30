package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseDocument;

public class PartManufacturer extends BaseDocument {

    private Part part;

    private Manufacturer manufacturer;

    private String partNumber;

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
}
