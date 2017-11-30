package io.joamit.inventory.domain.category;

import io.joamit.inventory.domain.BaseDocument;

public abstract class Category extends BaseDocument implements CategoryPath {

    /**
     * Holds Left element id
     */
    private Long left;

    /**
     * Holds right element id
     */
    private Long right;

    /**
     * Holds tree level
     */
    private Long level;

    /**
     * Holds root category id
     */
    private Long root;


    /**
     * Name of the category
     */
    private String name;

    /**
     * Description of the category
     */
    private String description;

    /**
     * Holds expansion information of category tree
     */
    private Boolean expanded = true;

    public Long getLeft() {
        return left;
    }

    public void setLeft(Long left) {
        this.left = left;
    }

    public Long getRight() {
        return right;
    }

    public void setRight(Long right) {
        this.right = right;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getRoot() {
        return root;
    }

    public void setRoot(Long root) {
        this.root = root;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getExpanded() {
        return expanded;
    }

    public void setExpanded(Boolean expanded) {
        this.expanded = expanded;
    }
}
