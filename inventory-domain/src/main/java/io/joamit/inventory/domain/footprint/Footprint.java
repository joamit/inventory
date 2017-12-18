package io.joamit.inventory.domain.footprint;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

/**
 * Footprint of the Inventory part
 */
public class Footprint extends BaseDocument {

    /**
     * Holds the part footprint name
     */
    private String name;

    /**
     * Holds the footprint description
     */
    private String description;

    /**
     * Holds the reference to the footprint category details
     */
    @DBRef
    private FootprintCategory footprintCategory;

    /**
     * Holds the reference to part footprint image details
     */
    @DBRef
    private FootprintImage footprintImage;

    /**
     * Holds information about the part footprint attachments
     */
    private List<FootprintAttachment> footprintAttachments;

    public String getCategoryPath() {
        if (this.footprintCategory == null) return "";
        else return this.footprintCategory.getCategoryPath();
    }

    /**
     * Initialize a new part footprint with empty list of attachments
     *
     * @param name        of the footprint
     * @param description of the footprint
     */
    public Footprint(String name, String description) {
        this.name = name;
        this.description = description;
        this.footprintAttachments = new ArrayList<>();
    }

    /**
     * Default constructor with initialized attachments list
     */
    public Footprint() {
        this.footprintAttachments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FootprintCategory getFootprintCategory() {
        return footprintCategory;
    }

    public void setFootprintCategory(FootprintCategory footprintCategory) {
        this.footprintCategory = footprintCategory;
    }

    public FootprintImage getFootprintImage() {
        return footprintImage;
    }

    public void setFootprintImage(FootprintImage footprintImage) {
        this.footprintImage = footprintImage;
    }

    public List<FootprintAttachment> getFootprintAttachments() {
        return footprintAttachments;
    }

    public void setFootprintAttachments(List<FootprintAttachment> footprintAttachments) {
        this.footprintAttachments = footprintAttachments;
    }

    public void addAttachment(FootprintAttachment footprintAttachment) {
        if (footprintAttachment != null) {
            footprintAttachment.setFootprint(this);
        }
        this.footprintAttachments.add(footprintAttachment);
    }
}
