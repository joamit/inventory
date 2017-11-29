package io.joamit.inventory.domain.category;

public interface CategoryPath {

    /**
     * Sets the category path for a category
     *
     * @param categoryPath path string
     */
    void setCategoryPath(String categoryPath);

    /**
     * Generate the path string for a category using path separator
     *
     * @param pathSeparator string
     * @return category path
     */
    String generateCategoryPath(String pathSeparator);
}
