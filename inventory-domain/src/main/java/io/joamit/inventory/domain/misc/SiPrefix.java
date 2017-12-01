package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;

/**
 * Represents an SI Prefix
 */
public class SiPrefix extends BaseDocument {

    /**
     * The prefix name of the Si-Prefix (e.g. yotta, deca, deci, centi).
     */
    private String prefix;

    /**
     * The symbol of the Si-Prefix (e.g. m, M, G).
     * TODO: Move it to an enum of accepted symbols, but won't that be an exhaustive enum list??
     */
    private String symbol;

    /**
     * The exponent of the Si-Prefix (e.g. milli = 10^-3).
     */
    private Integer exponent;

    /**
     * The base of the Si-Prefix (e.g. 2^-3).
     */
    private Integer base;

    /**
     * Initialize SI Prefix with given details
     *
     * @param prefix   of the instance
     * @param symbol   of the instance
     * @param exponent of the instance
     * @param base     of the instance
     */
    public SiPrefix(String prefix, String symbol, Integer exponent, Integer base) {
        this.prefix = prefix;
        this.symbol = symbol;
        this.exponent = exponent;
        this.base = base;
    }

    public SiPrefix() {
    }

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

    /**
     * calculates the product for given part's value using this SI Prefix
     *
     * @param value of the part
     * @return calculated product using SI Prefix details
     */
    public Double calculateProduct(Double value) {
        return value * Math.pow(this.base, this.exponent);
    }
}
