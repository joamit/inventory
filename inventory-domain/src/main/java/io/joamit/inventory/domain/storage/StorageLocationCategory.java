package io.joamit.inventory.domain.storage;

import io.joamit.inventory.domain.category.Category;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * Storage Location Category information
 */
public class StorageLocationCategory extends Category {

    /**
     * parent storage location if any
     */
    @DBRef
    private StorageLocationCategory parent;

    /**
     * References to any children locations if any
     */
    private List<StorageLocationCategory> children;

    /**
     * Reference to the storage location for this category
     */
    private List<StorageLocation> storageLocations;

    /**
     * Storage location category path
     */
    private String categoryPath;

    public StorageLocationCategory getParent() {
        return parent;
    }

    public void setParent(StorageLocationCategory parent) {
        this.parent = parent;
    }

    public List<StorageLocationCategory> getChildren() {
        return children;
    }

    public void setChildren(List<StorageLocationCategory> children) {
        this.children = children;
    }

    public List<StorageLocation> getStorageLocations() {
        return storageLocations;
    }

    public void setStorageLocations(List<StorageLocation> storageLocations) {
        this.storageLocations = storageLocations;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    @Override
    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    @Override
    public String generateCategoryPath(String pathSeparator) {
        if (this.parent == null) {
            return this.getName();
        } else {
            return this.parent.generateCategoryPath(pathSeparator).concat(pathSeparator).concat(this.getName());
        }
    }
}
