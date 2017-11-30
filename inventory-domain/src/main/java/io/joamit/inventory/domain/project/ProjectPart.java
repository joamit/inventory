package io.joamit.inventory.domain.project;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.misc.OverageType;
import io.joamit.inventory.domain.part.Part;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class ProjectPart extends BaseDocument {

    @DBRef
    private Part part;

    private Integer quantity;

    @DBRef
    private Project project;

    private String remarks;

    private OverageType overageType;

    private Integer overage;

    private String lotNumber;

    private Integer totalQuantity;

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

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}
