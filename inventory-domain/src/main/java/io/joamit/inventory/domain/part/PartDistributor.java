package io.joamit.inventory.domain.part;

import io.joamit.inventory.domain.BaseDocument;

public class PartDistributor extends BaseDocument {

    private Part part;

    private Distributor distributor;

    private String orderNumber;

    private Integer packagingUnit;

    private Double price;

    private String currency;

    private String stockKeepingUnit;

    private Boolean ignoreForReports;

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getPackagingUnit() {
        return packagingUnit;
    }

    public void setPackagingUnit(Integer packagingUnit) {
        this.packagingUnit = packagingUnit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStockKeepingUnit() {
        return stockKeepingUnit;
    }

    public void setStockKeepingUnit(String stockKeepingUnit) {
        this.stockKeepingUnit = stockKeepingUnit;
    }

    public Boolean getIgnoreForReports() {
        return ignoreForReports;
    }

    public void setIgnoreForReports(Boolean ignoreForReports) {
        this.ignoreForReports = ignoreForReports;
    }
}
