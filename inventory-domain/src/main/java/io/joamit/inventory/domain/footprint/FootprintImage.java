package io.joamit.inventory.domain.footprint;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class FootprintImage extends BaseDocument {

    /**
     * Reference to the footprint object of which this is an image
     */
    @DBRef
    private Footprint footprint;

    /**
     * Name of the footprint image
     */
    private String name;

    /**
     * Image comments (Optional)
     */
    private String comments;

    /**
     * Initialize a footprint image
     *
     * @param name     of the image
     * @param comments for the image
     */
    public FootprintImage(String name, String comments) {
        this.name = name;
        this.comments = comments;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
