package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseDocument;

public class SiPrefix extends BaseDocument {

    private String prefix;

    private String symbol;

    private Integer exponent;

    private Integer base;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getExponent() {
        return exponent;
    }

    public void setExponent(Integer exponent) {
        this.exponent = exponent;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    private Double calculateProduct(Double value) {
        return value * Math.pow(this.base, this.exponent);
    }
}
