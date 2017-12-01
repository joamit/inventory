package io.joamit.inventory.domain.storage;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Holds information about the part's storage location, this object needs to extended further to hold
 * inventory warehouse details
 */
public class StorageLocation extends BaseDocument {

    /**
     * Name of the storage location
     */
    private String name;

    /**
     * Storage location image details
     */
    @DBRef
    private StorageLocationImage storageLocationImage;

    /**
     * Storage location category
     */
    @DBRef
    private StorageLocationCategory storageLocationCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StorageLocationImage getStorageLocationImage() {
        return storageLocationImage;
    }

    public void setStorageLocationImage(StorageLocationImage storageLocationImage) {
        this.storageLocationImage = storageLocationImage;
    }

    public StorageLocationCategory getStorageLocationCategory() {
        return storageLocationCategory;
    }

    public void setStorageLocationCategory(StorageLocationCategory storageLocationCategory) {
        this.storageLocationCategory = storageLocationCategory;
    }
}
