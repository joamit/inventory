package io.joamit.inventory.domain.storage;

import io.joamit.inventory.domain.BaseDocument;

public class StorageLocation extends BaseDocument {

    private String name;

    private StorageLocationImage storageLocationImage;

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
