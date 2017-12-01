package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.part.Part;
import io.joamit.inventory.domain.part.ValueType;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Arrays;

/**
 * Inventory part parameter criteria's
 */
public class MetaPartParameterCriteria extends BaseDocument {

    /**
     * Reference part which holds this criteria
     */
    @DBRef
    private Part part;

    /**
     * Part's parameter name
     */
    private String partParameterName;

    /**
     * part's operator value
     */
    private String operator;

    /**
     * value of this parameter
     */
    private Double value;

    /**
     * Normalized value of this parameter
     */
    private Double normalizedValue;

    /**
     * Reference to this part parameter's SI Prefix
     */
    @DBRef
    private SiPrefix siPrefix;

    /**
     * Value of this part parameter as a string
     */
    private String valueStr;

    /**
     * Type of part parameter value (keeping it generic)
     */
    private ValueType valueType;

    /**
     * Reference to the part parameter's unit
     */
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

    /**
     * Determine what value type is this part parameter (String or numeric)
     *
     * @return value type of this part parameter
     */
    public ValueType getValueType() {
        if (Arrays.asList(ValueType.values()).contains(this.valueType)) return this.valueType;
        else return ValueType.NUMERIC;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    /**
     * Recalculate normalized value of this part's parameter depending on its SiPrefix
     *
     * @return adjusted normalized value of part parameter
     */
    public Double recalculateNormalizedValue() {
        if (this.siPrefix == null) {
            this.normalizedValue = this.value;
        } else {
            this.normalizedValue = this.siPrefix.calculateProduct(this.value);
        }
        return this.normalizedValue;
    }
}
