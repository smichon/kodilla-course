package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private SupplierAndProductInformation supplierAndProductInformation;
    private OrderService orderService;
    private InformationService informationService;

    public OrderProcessor(SupplierAndProductInformation supplierAndProductInformation,
                          OrderService orderService,
                          InformationService informationService) {
        this.supplierAndProductInformation = supplierAndProductInformation;
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public OrderDto process (Supplier supplier) {
        supplierAndProductInformation.getSupplierName();
        supplierAndProductInformation.getProductList();
        boolean isOrdered = orderService.process(supplier.getSupplierName(),
                                            supplier.getProductList());
        if (isOrdered) {
            informationService.inform();
            return new OrderDto(supplierAndProductInformation.getSupplierName(),
                                supplierAndProductInformation.getProductList(), true);
        } else {
            return new OrderDto(supplierAndProductInformation.getSupplierName(),
                                supplierAndProductInformation.getProductList(), false);
        }
    }
}
