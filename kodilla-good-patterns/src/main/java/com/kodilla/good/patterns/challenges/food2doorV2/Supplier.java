package com.kodilla.good.patterns.challenges.food2doorV2;

import java.util.List;

public interface Supplier {

    String getSupplierName();
    List<Products> getProductList();
    boolean process(String name, List<Products> productList);
}
