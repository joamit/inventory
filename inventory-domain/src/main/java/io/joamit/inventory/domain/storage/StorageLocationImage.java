package io.joamit.inventory.domain.storage;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class StorageLocationImage extends BaseDocument {

    @DBRef
    private StorageLocation storageLocation;

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }
}
