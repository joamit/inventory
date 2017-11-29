package io.joamit.inventory.domain.category;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class PartCategory extends Category {

    @ManyToOne(targetEntity = PartCategory.class)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Category parent;

    @OneToMany(targetEntity = PartCategory.class, mappedBy = "parent")
    private List<Category> children;

    @Column
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
