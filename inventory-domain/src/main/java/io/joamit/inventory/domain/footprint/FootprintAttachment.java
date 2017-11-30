package io.joamit.inventory.domain.footprint;

import io.joamit.inventory.domain.BaseDocument;

public class FootprintAttachment extends BaseDocument {

    private Footprint footprint;

    public Footprint getFootprint() {
        return footprint;
    }

    public void setFootprint(Footprint footprint) {
        this.footprint = footprint;
    }
}
