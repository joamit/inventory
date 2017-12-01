package io.joamit.inventory.domain.misc;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

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
    @DBRef
    private List<SiPrefix> prefixes;

    /**
     * Initialize a new unit instance
     *
     * @param name   of the new unit
     * @param symbol of the new unit
     */
    public Unit(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
        this.prefixes = new ArrayList<>();
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

    public List<SiPrefix> getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(List<SiPrefix> prefixes) {
        this.prefixes = prefixes;
    }
}
