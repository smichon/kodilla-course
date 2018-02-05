package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Supplier2Service implements OrderService {
    @Override
    public boolean process(String name, List<Product> productList) {
        if (name != null && !productList.isEmpty()) {
            System.out.println("Welcome to 'HealthyShop'!\nProcessing Your order...");
            return true;
        } else {
            return false;
        }
    }
}
