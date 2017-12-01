package io.joamit.inventory.domain.footprint;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Attachment of the inventory part footprint
 */
public class FootprintAttachment extends BaseDocument {

    /**
     * Footprint parent object of which this object is an attachment
     * this object can later be extended to hold information about the save attachment blob
     */
    @DBRef
    private Footprint footprint;

    /**
     * Attachment name
     */
    private String name;

    private String details;

    /**
     * Initialize a footprint attachment object
     *
     * @param name    of the footprint attachment
     * @param details of the footprint attachment
     */
    public FootprintAttachment(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public FootprintAttachment() {
    }

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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
