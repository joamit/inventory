package io.joamit.inventory.domain.footprint;

import io.joamit.inventory.domain.category.Category;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

/**
 * Inventory part footprint category details
 */
public class FootprintCategory extends Category {

    /**
     * Parent category for this Footprint Cateogry (if there is any) (optional)
     */
    @DBRef
    private Category parent;

    /**
     * Children categories for this Footprint category (if there are any) (totally optional)
     */
    private List<Category> children;

    /**
     * list of footprint this category holds
     * (this is a reference to all the footprints that have this category as a footprint category)
     */
    private List<Footprint> footprints;

    /**
     * Full category path from its root parent
     */
    private String categoryPath;

    /**
     * Initialize the category with empty children list
     */
    public FootprintCategory() {
        this.children = new ArrayList<>();
    }

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

    public List<Footprint> getFootprints() {
        return footprints;
    }

    public void setFootprints(List<Footprint> footprints) {
        this.footprints = footprints;
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
