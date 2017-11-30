package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.misc.Manufacturer;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class PartManufacturer extends BaseDocument {

    @DBRef
    private Part part;

    @DBRef
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
