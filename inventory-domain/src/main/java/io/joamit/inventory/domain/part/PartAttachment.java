package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseDocument;

public class PartAttachment extends BaseDocument {

    private boolean isImage;

    private Part part;

    public boolean isImage() {
        return isImage;
    }

    public void setImage(boolean image) {
        isImage = image;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
}
