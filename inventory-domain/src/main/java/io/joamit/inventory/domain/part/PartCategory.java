package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.category.Category;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

public class PartCategory extends Category {

    /**
     * Holds information about parent category
     */
    @DBRef
    private Category parent;

    /**
     * Holds information about all related categories
     */
    private List<Category> children;

    /**
     * Holds category tree path
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
