package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseDocument;

import java.util.List;

public class PartMeasurementUnit extends BaseDocument {

    private String name;

    private String shortName;

    private Boolean defaultUnit;

    private List<Part> parts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Boolean getDefaultUnit() {
        return defaultUnit;
    }

    public void setDefaultUnit(Boolean defaultUnit) {
        this.defaultUnit = defaultUnit;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }
}
