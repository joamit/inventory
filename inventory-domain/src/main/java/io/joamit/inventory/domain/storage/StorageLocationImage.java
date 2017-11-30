package io.joamit.inventory.domain.storage;

import io.joamit.inventory.domain.BaseDocument;

public class StorageLocationImage extends BaseDocument {

    private StorageLocation storageLocation;

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }
}
