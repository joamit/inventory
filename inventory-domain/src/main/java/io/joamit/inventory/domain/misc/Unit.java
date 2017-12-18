package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;

/**
 * This object represents an unit. Units can be: Volt, Hertz etc.
 */
public class Unit extends BaseDocument {

    /**
     * Name of unit e.g. Volt, Farad, Ampere etc.
     */
    private String name;

    /**
     * Symbol of unit e.g. V, A, F, m
     */
    private String symbol;

    /**
     * Holds reference to the SI Prefix for this part
     */
    private SiPrefix siPrefix;

    /**
     * Initialize a new unit instance
     *
     * @param name   of the new unit
     * @param symbol of the new unit
     */
    public Unit(String name, String symbol, SiPrefix siPrefix) {
        this.name = name;
        this.symbol = symbol;
        this.siPrefix = siPrefix;
    }

    public Unit(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
        this.siPrefix = null;
    }

    public Unit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public SiPrefix getSiPrefix() {
        return siPrefix;
    }

    public void setSiPrefix(SiPrefix siPrefix) {
        this.siPrefix = siPrefix;
    }
}
