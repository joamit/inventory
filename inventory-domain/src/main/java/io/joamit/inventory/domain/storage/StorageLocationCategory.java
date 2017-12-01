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
    private Category parent;

    /**
     * References to any children locations if any
     */
    @DBRef
    private List<Category> children;

    /**
     * Reference to the storage location for this category
     */
    @DBRef
    private List<StorageLocation> storageLocations;

    /**
     * Storage location category path
     */
    private String categoryPath;

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
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
