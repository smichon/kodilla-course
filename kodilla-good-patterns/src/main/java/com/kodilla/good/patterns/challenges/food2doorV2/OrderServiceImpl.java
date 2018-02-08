package com.kodilla.good.patterns.challenges.food2doorV2;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private List<Supplier> supplierList = new ArrayList<>();

    @Override
    public boolean process(String name, List<Products> productList) {
        for (Supplier supplier:supplierList) {
            if (supplier.getSupplierName().equals(name)) {
                return supplier.process(supplier.getSupplierName(), supplier.getProductList());
            }

        }
        return false;
    }

    public List<Supplier> getSupplierList() {
        return supplierList;
    }

    public void addSupplier(Supplier supplier) {
        supplierList.add(supplier);
    }

    public void removeSupplier(Supplier supplier) {
        supplierList.remove(supplier);
    }
}
