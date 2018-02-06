package com.kodilla.good.patterns.challenges.food2doorV2;

import java.util.List;

public class HealthyShop implements Supplier {
    private String supplierName;
    private String supplierId;
    private List<Products> productList;

    public HealthyShop(String supplierName, String supplierId, List<Products> productList) {
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

    public List<Products> getProductList() {
        return productList;
    }

    public boolean process(String name, List<Products> productList) {
        if (name != null && !productList.isEmpty()) {
            System.out.println("Welcome to 'HealthyShop'!\nProcessing Your order...");
            return true;
        } else {
            return false;
        }
    }
}
