package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Supplier1Service implements OrderService {
    @Override
    public boolean process(String name, List<Product> productList) {
        if (name != null && !productList.isEmpty()) {
            System.out.println("Welcome to 'ExtraFoodShop'!\nProcessing Your order...");
            return true;
        } else {
            return false;
        }
    }
}
