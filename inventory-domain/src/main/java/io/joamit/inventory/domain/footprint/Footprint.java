package io.joamit.inventory.domain.footprint;

import io.joamit.inventory.domain.BaseDocument;

import java.util.List;

public class Footprint extends BaseDocument {

    private String name;

    private String description;

    private FootprintCategory footprintCategory;

    private FootprintImage footprintImage;

    private List<FootprintAttachment> footprintAttachments;

    public String getCategoryPath() {
        if (this.footprintCategory == null) return "";
        else return this.footprintCategory.getCategoryPath();
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
}
