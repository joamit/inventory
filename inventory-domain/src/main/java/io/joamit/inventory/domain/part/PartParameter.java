package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseDocument;

public class PartParameter extends BaseDocument {

    private Part part;

    private String name;

    private String description;

    private Unit unit;

    private Double value;

    private Double normalizedValue;

    private Double maxValue;

    private Double normalizedMaxValue;

    private Double minValue;

    /**
     * SiPrefix + value
     */
    private Double normalizedMinValue;

    private String valueStr;

    private String valueType;

    private SiPrefix siPrefix;

    private SiPrefix minSiPrefix;

    private SiPrefix maxSiPrefix;

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getNormalizedValue() {
        return normalizedValue;
    }

    public void setNormalizedValue(Double normalizedValue) {
        this.normalizedValue = normalizedValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getNormalizedMaxValue() {
        return normalizedMaxValue;
    }

    public void setNormalizedMaxValue(Double normalizedMaxValue) {
        this.normalizedMaxValue = normalizedMaxValue;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getNormalizedMinValue() {
        return normalizedMinValue;
    }

    public void setNormalizedMinValue(Double normalizedMinValue) {
        this.normalizedMinValue = normalizedMinValue;
    }

    public String getValueStr() {
        return valueStr;
    }

    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public SiPrefix getSiPrefix() {
        return siPrefix;
    }

    public void setSiPrefix(SiPrefix siPrefix) {
        this.siPrefix = siPrefix;
    }

    public SiPrefix getMinSiPrefix() {
        return minSiPrefix;
    }

    public void setMinSiPrefix(SiPrefix minSiPrefix) {
        this.minSiPrefix = minSiPrefix;
    }

    public SiPrefix getMaxSiPrefix() {
        return maxSiPrefix;
    }

    public void setMaxSiPrefix(SiPrefix maxSiPrefix) {
        this.maxSiPrefix = maxSiPrefix;
    }
}
