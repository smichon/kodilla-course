package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderExecutor {
    public static void main(String[] args) {
        EntryDataRetriever entryDataRetriever = new EntryDataRetriever();
        Supplier supplier1 = entryDataRetriever.retrieveSupplier1();
        Supplier supplier2 = entryDataRetriever.retrieveSupplier2();
        Supplier supplier3 = entryDataRetriever.retrieveSupplier3();

        OrderProcessor orderProcessor1 = new OrderProcessor(supplier1 ,new Supplier1Service(), new InformationToConfirm());
        orderProcessor1.process(supplier1);

        OrderProcessor orderProcessor2 = new OrderProcessor(supplier2 ,new Supplier2Service(), new InformationToConfirm());
        orderProcessor2.process(supplier2);

        OrderProcessor orderProcessor3 = new OrderProcessor(supplier3, new Supplier3Service(), new InformationToConfirm());
        orderProcessor3.process(supplier3);
    }
}
