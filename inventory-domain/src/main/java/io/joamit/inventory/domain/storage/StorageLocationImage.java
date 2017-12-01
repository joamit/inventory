package io.joamit.inventory.domain.storage;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Holds information on storage location's image
 */
public class StorageLocationImage extends BaseDocument {

    /**
     * reference to the storage location this image refers to
     */
    @DBRef
    private StorageLocation storageLocation;

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

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }
}
