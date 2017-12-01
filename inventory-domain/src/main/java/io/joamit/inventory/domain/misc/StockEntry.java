package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.part.Part;
import io.joamit.inventory.domain.user.User;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

/**
 * Represents an entry for stock value of a product by a user
 */
public class StockEntry extends BaseDocument {

    /**
     * Holds information about the stock level of a part
     */
    private Integer stockLevel;

    /**
     * Holds information about the part which has this stock entry
     */
    @DBRef
    private Part part;

    /**
     * Holds information about the user who performed this stock entry for a part
     */
    @DBRef
    private User user;

    /**
     * Price for unit of stock
     */
    private Double price;

    /**
     * Instance of time when this stock entry was done
     */
    private Date creationTime;

    /**
     * Was this entry a part of correction to existing entry
     */
    private Boolean correction;

    /**
     * Any specific comment to this stock entry
     */
    private String comment;

    /**
     * Initialize a stock entry with provided details
     *
     * @param stockLevel of the entry
     * @param price      of the entry
     * @param comment    if any
     */
    public StockEntry(Integer stockLevel, Double price, String comment) {
        this.stockLevel = stockLevel;
        this.price = price;
        this.creationTime = new Date();
        this.correction = false;
        this.comment = comment;
    }

    public StockEntry() {
    }

    public Integer getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Integer stockLevel) {
        this.stockLevel = stockLevel;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Boolean getCorrection() {
        return correction;
    }

    public void setCorrection(Boolean correction) {
        this.correction = correction;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Can this entry be marked for removal??
     *
     * @return true/false
     */
    public boolean isRemoval() {
        return this.stockLevel < 0;
    }
}

