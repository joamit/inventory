package io.joamit.inventory.domain.footprint;

import io.joamit.inventory.domain.BaseDocument;

public class FootprintAttachment extends BaseDocument {

    private Footprint footprint;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Footprint getFootprint() {
        return footprint;
    }

    public void setFootprint(Footprint footprint) {
        this.footprint = footprint;
    }
}
