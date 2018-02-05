package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Supplier implements SupplierAndProductInformation {
    private String supplierName;
    private String supplierId;
    private List<Product> productList;

    public Supplier(String supplierName, String supplierId, List<Product> productList) {
        this.supplierName = supplierName;
        this.supplierId = supplierId;
        this.productList = productList;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
