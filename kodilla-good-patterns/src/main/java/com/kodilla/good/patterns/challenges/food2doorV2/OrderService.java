package com.kodilla.good.patterns.challenges.food2doorV2;

import java.util.List;

public interface OrderService {
    boolean process(String name, List<Products> productList);
    void addSupplier(Supplier supplier);
}
