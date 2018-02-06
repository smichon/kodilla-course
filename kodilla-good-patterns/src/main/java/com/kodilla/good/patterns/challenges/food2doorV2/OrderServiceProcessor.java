package com.kodilla.good.patterns.challenges.food2doorV2;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceProcessor {
    private Supplier supplier;
    private InformService informService;
    private List<Supplier> supplierList = new ArrayList<>();

    public OrderServiceProcessor(Supplier supplier, InformService informService) {
        this.supplier = supplier;
        this.informService = informService;
    }

    public List<Supplier> getSupplierList() {
        return supplierList;
    }

    public void supplierList(Supplier supplier) {
        supplierList.add(supplier);
    }

    public OrderDTO order(Supplier supplier) {
        supplier.getSupplierName();
        supplier.getProductList();
        boolean isOrdered = supplier.process(supplier.getSupplierName(), supplier.getProductList());
        if (isOrdered) {
            informService.inform();
            return new OrderDTO(supplier.getSupplierName(),
                                supplier.getProductList(), true);
        } else {
            return new OrderDTO(supplier.getSupplierName(),
                                supplier.getProductList(), false);
        }
    }
}
