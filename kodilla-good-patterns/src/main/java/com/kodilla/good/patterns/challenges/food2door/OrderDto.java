package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderDto {
        private String name;
        private List<Product> productList;
        private boolean isOrder;

    public OrderDto(String name, List<Product> productList, boolean isOrder) {
        this.name = name;
        this.productList = productList;
        this.isOrder = isOrder;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
