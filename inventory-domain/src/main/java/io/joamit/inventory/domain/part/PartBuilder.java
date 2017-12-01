package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.category.Category;
import io.joamit.inventory.domain.footprint.Footprint;
import io.joamit.inventory.domain.misc.MetaPartParameterCriteria;
import io.joamit.inventory.domain.misc.StockEntry;
import io.joamit.inventory.domain.project.ProjectPart;
import io.joamit.inventory.domain.storage.StorageLocation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Helper builder for the part instance, considering we have a lot of instances here
 */
public final class PartBuilder {
    private Category category;
    private String name;
    private String description;
    private Footprint footprint;
    private PartMeasurementUnit partMeasurementUnit;
    private StorageLocation storageLocation;
    private List<PartManufacturer> partManufacturers;
    private List<PartDistributor> partDistributors;
    private List<PartAttachment> partAttachments;
    private String comment;
    private Long stock = 0L;
    private Long minStockLevel = 0L;
    private Double averagePrice = 0d;
    private List<StockEntry> stockEntries;
    private List<PartParameter> partParameters;
    private List<MetaPartParameterCriteria> metaPartParameterCriterias;
    private String status;
    private Boolean needsReview = false;
    private String condition;
    private String productionRemarks;
    private Date creationDate;
    private List<ProjectPart> projectParts;
    private String internalPartNumber;
    private Boolean removals = false;
    private Boolean lowStock = false;
    private Boolean metaPart = false;

    private PartBuilder() {
    }

    public static PartBuilder aPart() {
        return new PartBuilder();
    }

    public PartBuilder withCategory(Category category) {
        this.category = category;
        return this;
    }

    public PartBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PartBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public PartBuilder withFootprint(Footprint footprint) {
        this.footprint = footprint;
        return this;
    }

    public PartBuilder withPartMeasurementUnit(PartMeasurementUnit partMeasurementUnit) {
        this.partMeasurementUnit = partMeasurementUnit;
        return this;
    }

    public PartBuilder withStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    public PartBuilder withPartManufacturers(List<PartManufacturer> partManufacturers) {
        this.partManufacturers = partManufacturers;
        return this;
    }

    public PartBuilder withPartDistributors(List<PartDistributor> partDistributors) {
        this.partDistributors = partDistributors;
        return this;
    }

    public PartBuilder withPartAttachments(List<PartAttachment> partAttachments) {
        this.partAttachments = partAttachments;
        return this;
    }

    public PartBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public PartBuilder withStock(Long stock) {
        this.stock = stock;
        return this;
    }

    public PartBuilder withMinStockLevel(Long minStockLevel) {
        this.minStockLevel = minStockLevel;
        return this;
    }

    public PartBuilder withAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
        return this;
    }

    public PartBuilder withStockEntries(List<StockEntry> stockEntries) {
        this.stockEntries = stockEntries;
        return this;
    }

    public PartBuilder withPartParameters(List<PartParameter> partParameters) {
        this.partParameters = partParameters;
        return this;
    }

    public PartBuilder withMetaPartParameterCriterias(List<MetaPartParameterCriteria> metaPartParameterCriterias) {
        this.metaPartParameterCriterias = metaPartParameterCriterias;
        return this;
    }

    public PartBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public PartBuilder withNeedsReview(Boolean needsReview) {
        this.needsReview = needsReview;
        return this;
    }

    public PartBuilder withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public PartBuilder withProductionRemarks(String productionRemarks) {
        this.productionRemarks = productionRemarks;
        return this;
    }

    public PartBuilder withCreationDate(Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public PartBuilder withProjectParts(List<ProjectPart> projectParts) {
        this.projectParts = projectParts;
        return this;
    }

    public PartBuilder withInternalPartNumber(String internalPartNumber) {
        this.internalPartNumber = internalPartNumber;
        return this;
    }

    public PartBuilder withRemovals(Boolean removals) {
        this.removals = removals;
        return this;
    }

    public PartBuilder withLowStock(Boolean lowStock) {
        this.lowStock = lowStock;
        return this;
    }

    public PartBuilder withMetaPart(Boolean metaPart) {
        this.metaPart = metaPart;
        return this;
    }

    public Part build() {
        Part part = new Part();
        part.setCategory(category);
        part.setName(name);
        part.setDescription(description);
        part.setFootprint(footprint);
        part.setPartMeasurementUnit(partMeasurementUnit);
        part.setStorageLocation(storageLocation);
        part.setPartManufacturers(partManufacturers == null ? new ArrayList<>() : partManufacturers);
        part.setPartDistributors(partDistributors == null ? new ArrayList<>() : partDistributors);
        part.setPartAttachments(partAttachments == null ? new ArrayList<>() : partAttachments);
        part.setComment(comment);
        part.setStock(stock);
        part.setMinStockLevel(minStockLevel);
        part.setAveragePrice(averagePrice);
        part.setStockEntries(stockEntries == null ? new ArrayList<>() : stockEntries);
        part.setPartParameters(partParameters == null ? new ArrayList<>() : partParameters);
        part.setMetaPartParameterCriterias(metaPartParameterCriterias == null ? new ArrayList<>() : metaPartParameterCriterias);
        part.setStatus(status);
        part.setNeedsReview(needsReview);
        part.setCondition(condition);
        part.setProductionRemarks(productionRemarks);
        part.setCreationDate(creationDate);
        part.setProjectParts(projectParts == null ? new ArrayList<>() : projectParts);
        part.setInternalPartNumber(internalPartNumber);
        part.setRemovals(removals);
        part.setLowStock(lowStock);
        part.setMetaPart(metaPart);
        return part;
    }
}
