package io.joamit.inventory.domain.project;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.misc.OverageType;
import io.joamit.inventory.domain.part.Part;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Represents a project part
 */
public class ProjectPart extends BaseDocument {

    /**
     * The part this project part refers to.
     */
    @DBRef
    private Part part;

    /**
     * Specifies the amount of parts.
     */
    private Integer quantity;

    /**
     * Specifies the project which has this project part.
     */
    @DBRef
    private Project project;

    /**
     * Specifies the remarks for this entry.
     */
    private String remarks;

    /**
     * The overage type.
     */
    private OverageType overageType;

    /**
     * Specifies the overage, which can either be percent or an absolute value depending on overageType.
     */
    private Integer overage;

    /**
     * Specifies the lot number.
     */
    private String lotNumber;

    /**
     * The total quantity including overage.
     */
    private Integer totalQuantity;

    /**
     * Retrieves the total quantity for a project part, including overage.
     *
     * @return total quantity
     */
    public Integer getTotalQuantity() {
        switch (this.getOverageType()) {
            case PERCENT:
                return this.getQuantity() * (1 + this.getOverage() / 100);
            case ABSOLUTE:
                return this.getQuantity() + this.getOverage();
            default:
                return this.getQuantity();
        }
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public OverageType getOverageType() {
        return overageType;
    }

    public void setOverageType(OverageType overageType) {
        this.overageType = overageType;
    }

    public Integer getOverage() {
        return overage;
    }

    public void setOverage(Integer overage) {
        this.overage = overage;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}
