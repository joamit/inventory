package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.category.Category;
import io.joamit.inventory.domain.exception.MinStockLevelOutOfRangeException;
import io.joamit.inventory.domain.footprint.Footprint;
import io.joamit.inventory.domain.misc.MetaPartParameterCriteria;
import io.joamit.inventory.domain.misc.StockEntry;
import io.joamit.inventory.domain.project.ProjectPart;
import io.joamit.inventory.domain.storage.StorageLocation;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Inventory part domain model
 */
public class Part extends BaseDocument {

    /**
     * Holds category information for this part
     */
    @DBRef
    private Category category;

    /**
     * Name of the part
     */
    private String name;

    /**
     * description of the part
     */
    private String description;

    /**
     * Footprint of the part
     */
    @DBRef
    private Footprint footprint;

    /**
     * The unit of measurement in which part's amount will be calculated. This is required to count the part in
     * "pieces", "meters" or "grams" etc.
     */
    @DBRef
    private PartMeasurementUnit partMeasurementUnit;

    /**
     * Holds storage location of this part
     */
    @DBRef
    private StorageLocation storageLocation;

    /**
     * Holds information about the partManufacturers which can produce this part
     */
    private List<PartManufacturer> partManufacturers;

    /**
     * Holds information about the partDistributors which can distribute this part
     */
    private List<PartDistributor> partDistributors;

    /**
     * Holds information about part attachments
     */
    private List<PartAttachment> partAttachments;

    /**
     * Holds any comment information for this part
     */
    private String comment;

    /**
     * Holds stock information for this part
     */
    private Long stock = 0L;

    /**
     * Holds minimum stock level information for the part
     */
    private Long minStockLevel = 0L;

    /**
     * Holds average price information for the part
     */
    private Double averagePrice = 0d;

    /**
     * Holds Stock entries for this part. This works as an audit for the part
     */
    private List<StockEntry> stockEntries;

    /**
     * Holds information about the parameters for this part
     */
    private List<PartParameter> partParameters;

    /**
     * Holds meta information about the part parameters
     */
    private List<MetaPartParameterCriteria> metaPartParameterCriterias;

    /**
     * Holds part status information
     */
    private String status;

    /**
     * Holds review eligibility info for this part
     */
    private Boolean needsReview = false;

    /**
     * Holds part condition information
     */
    private String condition;

    /**
     * Holds production remarks for this part
     */
    private String productionRemarks;

    /**
     * Holds creation date of the part
     */
    private Date creationDate;

    /**
     * Holds information about project parts
     */
    private List<ProjectPart> projectParts;

    /**
     * Holds information about internal part number if any
     */
    private String internalPartNumber;

    /**
     * Holds information about the removal status of this part
     */
    private Boolean removals = false;

    /**
     * If the stock is in low state
     */
    private Boolean lowStock = false;

    /**
     * If this is a meta part
     */
    private Boolean metaPart = false;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public Footprint getFootprint() {
        return footprint;
    }

    public void setFootprint(Footprint footprint) {
        this.footprint = footprint;
    }

    public PartMeasurementUnit getPartMeasurementUnit() {
        return partMeasurementUnit;
    }

    public void setPartMeasurementUnit(PartMeasurementUnit partMeasurementUnit) {
        this.partMeasurementUnit = partMeasurementUnit;
    }

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    public List<PartManufacturer> getPartManufacturers() {
        return partManufacturers;
    }

    public void setPartManufacturers(List<PartManufacturer> partManufacturers) {
        this.partManufacturers = partManufacturers;
    }

    public List<PartDistributor> getPartDistributors() {
        return partDistributors;
    }

    public void setPartDistributors(List<PartDistributor> partDistributors) {
        this.partDistributors = partDistributors;
    }

    public List<PartAttachment> getPartAttachments() {
        return partAttachments;
    }

    public void setPartAttachments(List<PartAttachment> partAttachments) {
        this.partAttachments = partAttachments;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getMinStockLevel() {
        return minStockLevel;
    }

    public Double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public List<StockEntry> getStockEntries() {
        return stockEntries;
    }

    public void setStockEntries(List<StockEntry> stockEntries) {
        this.stockEntries = stockEntries;
    }

    public List<PartParameter> getPartParameters() {
        return partParameters;
    }

    public void setPartParameters(List<PartParameter> partParameters) {
        this.partParameters = partParameters;
    }

    public List<MetaPartParameterCriteria> getMetaPartParameterCriterias() {
        return metaPartParameterCriterias;
    }

    public void setMetaPartParameterCriterias(List<MetaPartParameterCriteria> metaPartParameterCriterias) {
        this.metaPartParameterCriterias = metaPartParameterCriterias;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getNeedsReview() {
        return needsReview;
    }

    public void setNeedsReview(Boolean needsReview) {
        this.needsReview = needsReview;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getProductionRemarks() {
        return productionRemarks;
    }

    public void setProductionRemarks(String productionRemarks) {
        this.productionRemarks = productionRemarks;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<ProjectPart> getProjectParts() {
        return projectParts;
    }

    public void setProjectParts(List<ProjectPart> projectParts) {
        this.projectParts = projectParts;
    }

    public String getInternalPartNumber() {
        return internalPartNumber;
    }

    public void setInternalPartNumber(String internalPartNumber) {
        this.internalPartNumber = internalPartNumber;
    }

    public Boolean getRemovals() {
        return removals;
    }

    public void setRemovals(Boolean removals) {
        this.removals = removals;
    }

    public Boolean getLowStock() {
        return lowStock;
    }

    public void setLowStock(Boolean lowStock) {
        this.lowStock = lowStock;
    }

    public Boolean getMetaPart() {
        return metaPart;
    }

    public void setMetaPart(Boolean metaPart) {
        this.metaPart = metaPart;
    }

    /**
     * Create the full category path for this part
     *
     * @return category path with "/" separator
     */
    public String getCategoryPath() {
        if (this.category == null) return "";
        else return this.category.generateCategoryPath("/");
    }

    /**
     * Set the minimum stock level for this part.
     * Only positive values are allowed.
     *
     * @param minStockLevel A minimum stock level, only values >= 0 are allowed.
     * @throws MinStockLevelOutOfRangeException If the passed stock level is not in range (<0)
     */
    public void setMinStockLevel(Long minStockLevel) throws MinStockLevelOutOfRangeException {
        if (minStockLevel < 0) {
            throw new MinStockLevelOutOfRangeException();
        }

        this.minStockLevel = minStockLevel;

        this.lowStock = this.getStock() < this.minStockLevel;
    }

    public void recomputeStockLevels() {
        Long currentStock = 0L;
        Double avgPrice = 0D;

        Double totalPartStockPrice = 0D;
        Integer lastPosEntryQuant = 0;
        Double lastPosEntryPrice = 0D;
        Long negativeStock = 0L;

        for (StockEntry stockEntry : this.stockEntries) {
            currentStock += stockEntry.getStockLevel();

            if (currentStock <= 0) {
                avgPrice = 0D;
                totalPartStockPrice = 0D;
                negativeStock = currentStock;
            } else {
                if (stockEntry.getStockLevel() > 0) {
                    lastPosEntryQuant = stockEntry.getStockLevel();
                    lastPosEntryPrice = stockEntry.getPrice();
                    totalPartStockPrice += lastPosEntryPrice * (lastPosEntryQuant + negativeStock);
                    avgPrice = totalPartStockPrice / currentStock;
                } else {
                    if (currentStock < lastPosEntryQuant) {
                        totalPartStockPrice = currentStock * lastPosEntryPrice;
                        avgPrice = totalPartStockPrice / currentStock;
                    } else {
                        totalPartStockPrice += stockEntry.getStockLevel() * avgPrice;
                        avgPrice = totalPartStockPrice / currentStock;
                    }
                    negativeStock = 0L;
                }
            }
        }


        this.setStock(currentStock);
        this.setAveragePrice(avgPrice);
        this.lowStock = this.getStock() < this.minStockLevel;
    }

    /**
     * Returns the project names this part is used in.
     *
     * @return array
     */
    public List<String> getProjectNames() {
        return this.projectParts.stream().map(projectPart -> projectPart.getProject().getName()).distinct().collect(Collectors.toList());
    }
}
