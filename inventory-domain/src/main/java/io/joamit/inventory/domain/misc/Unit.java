package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Unit extends BaseDocument {

    /**
     * Name of unit e.g. Volt, Farad, Ampere etc.
     */
    private String name;

    /**
     * Symbol of unit e.g. V, A, F, m
     */
    private String symbol;

    @DBRef
    private SiPrefix prefixes;

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

    public SiPrefix getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(SiPrefix prefixes) {
        this.prefixes = prefixes;
    }
}