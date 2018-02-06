package com.kodilla.good.patterns.challenges.food2doorV2;

import java.util.List;

public class OrderDTO {
        private String name;
        private List<Products> productList;
        private boolean isOrder;

    public OrderDTO(String name, List<Products> productList, boolean isOrder) {
        this.name = name;
        this.productList = productList;
        this.isOrder = isOrder;
    }

    public String getName() {
        return name;
    }

    public List<Products> getProductList() {
        return productList;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
