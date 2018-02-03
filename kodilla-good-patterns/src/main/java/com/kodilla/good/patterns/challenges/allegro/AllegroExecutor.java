package com.kodilla.good.patterns.challenges.allegro;

public class AllegroExecutor {

    public static void main(String[] args) {
        EntryDataRetriever entryDataRetriever = new EntryDataRetriever();
        Basket basket = entryDataRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new SendInformation(), new OrderStatus());
        productOrderService.transactionProcess(basket);
    }
}
