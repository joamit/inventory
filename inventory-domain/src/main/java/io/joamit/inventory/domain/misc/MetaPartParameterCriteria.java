package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.part.Part;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class MetaPartParameterCriteria extends BaseDocument {

    @DBRef
    private Part part;

    private String partParameterName;

    private String operator;

    private Double value;

    private Double normalizedValue;

    @DBRef
    private SiPrefix siPrefix;

    private String valueStr;

    private String valueType;

    @DBRef
    private Unit unit;


    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public String getPartParameterName() {
        return partParameterName;
    }

    public void setPartParameterName(String partParameterName) {
        this.partParameterName = partParameterName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

    public SiPrefix getSiPrefix() {
        return siPrefix;
    }

    public void setSiPrefix(SiPrefix siPrefix) {
        this.siPrefix = siPrefix;
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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
