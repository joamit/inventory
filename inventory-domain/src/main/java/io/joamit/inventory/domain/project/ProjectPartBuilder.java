package io.joamit.inventory.domain.project;

import io.joamit.inventory.domain.misc.OverageType;
import io.joamit.inventory.domain.part.Part;

/**
 * Helper builder for the project part instance
 */
public final class ProjectPartBuilder {
    private Part part;
    private Integer quantity;
    private Project project;
    private String remarks;
    private OverageType overageType;
    private Integer overage;
    private String lotNumber;
    private Integer totalQuantity;

    private ProjectPartBuilder() {
    }

    public static ProjectPartBuilder aProjectPart() {
        return new ProjectPartBuilder();
    }

    public ProjectPartBuilder withPart(Part part) {
        this.part = part;
        return this;
    }

    public ProjectPartBuilder withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ProjectPartBuilder withProject(Project project) {
        this.project = project;
        return this;
    }

    public ProjectPartBuilder withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public ProjectPartBuilder withOverageType(OverageType overageType) {
        this.overageType = overageType;
        return this;
    }

    public ProjectPartBuilder withOverage(Integer overage) {
        this.overage = overage;
        return this;
    }

    public ProjectPartBuilder withLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
        return this;
    }

    public ProjectPartBuilder withTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
        return this;
    }

    public ProjectPart build() {
        ProjectPart projectPart = new ProjectPart();
        projectPart.setPart(part);
        projectPart.setQuantity(quantity);
        projectPart.setProject(project);
        projectPart.setRemarks(remarks);
        projectPart.setOverageType(overageType);
        projectPart.setOverage(overage);
        projectPart.setLotNumber(lotNumber);
        projectPart.setTotalQuantity(totalQuantity);
        return projectPart;
    }
}
