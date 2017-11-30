package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.part.Part;
import io.joamit.inventory.domain.user.User;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

public class StockEntry extends BaseDocument {

    private Integer stockLevel;

    private Part part;

    @DBRef
    private User user;

    private Double price;

    private Date creationTime;

    private Boolean correction;

    private String comment;

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
}

