package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseEntity;
import io.joamit.inventory.domain.category.Category;
import io.joamit.inventory.domain.category.PartCategory;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

public class Part extends BaseEntity {

    @ManyToOne(targetEntity = PartCategory.class)
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
    @ManyToOne(targetEntity = Footprint.class)
    private Footprint footprint;

    /**
     * The unit of measurement in which part's amount will be calculated. This is required to count the part in
     * "pieces", "meters" or "grams" etc.
     */
    @ManyToOne(targetEntity = PartMeasurementUnit.class)
    private PartMeasurementUnit partMeasurementUnit;

    /**
     * Holds storage location of this part
     */
    @ManyToOne(targetEntity = StorageLocation.class)
    private StorageLocation storageLocation;

    /**
     * Holds information about the partManufacturers which can produce this part
     */
    @OneToMany(targetEntity = PartManufacturer.class, mappedBy = "part", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<PartManufacturer> partManufacturers;

    /**
     * Holds information about the partDistributors which can distribute this part
     */
    @OneToMany(targetEntity = PartDistributor.class, mappedBy = "part", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<PartDistributor> partDistributors;

    /**
     * Holds information about part attachments
     */
    @OneToMany(targetEntity = PartAttachment.class, mappedBy = "part", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<PartAttachment> partAttachments;

    /**
     * Holds any comment information for this part
     */
    private String comment;

    /**
     * Holds stock information for this part
     */
    private Long stock = 0l;

    /**
     * Holds minimum stock level information for the part
     */
    private Long minStockLevel = 0l;

    /**
     * Holds average price information for the part
     */
    private Double averagePrice = 0d;

    /**
     * Holds Stock entries for this part. This works as an audit for the part
     */
    @OneToMany(targetEntity = StockEntry.class, mappedBy = "part", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<StockEntry> stockEntries;

    /**
     * Holds information about the parameters for this part
     */
    @OneToMany(targetEntity = PartParameter.class, mappedBy = "part", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<PartParameter> partParameters;

    /**
     * Holds meta information about the part parameters
     */
    @OneToMany(targetEntity = PartParameterCriteria.class, mappedBy = "part", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<PartParameterCriteria> partParameterCriterias;

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
    @OneToMany(targetEntity = ProjectPart.class, mappedBy = "part", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<ProjectPart> projectParts;

    /**
     * Holds information about internal part number if any
     */
    private String internalPartNumber;
}
