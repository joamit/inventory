package io.joamit.inventory.domain.storage;

import io.joamit.inventory.domain.BaseDocument;

/**
 * Holds information on storage location's image
 */
public class StorageLocationImage extends BaseDocument {

    /**
     * Name of the storage location image
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
