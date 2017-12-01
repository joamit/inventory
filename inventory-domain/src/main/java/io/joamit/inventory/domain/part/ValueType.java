package io.joamit.inventory.domain.part;

public enum ValueType {

    STRING("String"), NUMERIC("Double");

    private String valueType;

    ValueType(String valueType) {
        this.valueType = valueType;
    }
}
