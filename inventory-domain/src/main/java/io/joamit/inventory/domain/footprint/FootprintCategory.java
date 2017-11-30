package io.joamit.inventory.domain.footprint;

import io.joamit.inventory.domain.category.Category;

import java.util.List;

public class FootprintCategory extends Category {

    private Category parent;

    private List<Category> children;

    private List<Footprint> footprints;

    private String categoryPath;

    @Override
    public Category getParent() {
        return parent;
    }

    @Override
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
