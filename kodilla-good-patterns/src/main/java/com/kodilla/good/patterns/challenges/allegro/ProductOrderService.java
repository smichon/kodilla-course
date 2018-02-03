package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderService {
    private InformationService informationService;
    private OrderInformation orderInformation;

    public ProductOrderService(InformationService informationService, OrderInformation orderInformation) {
        this.informationService = informationService;
        this.orderInformation = orderInformation;
    }

    public BuyDto transactionProcess(Basket basket) {
        boolean isBought = orderInformation.bought(basket.getItem(), basket.getUser());

        if (isBought) {
            informationService.inform(basket.getUser());
            return new BuyDto(basket.getUser(), true);
        } else {
            return new BuyDto(basket.getUser(), false);
        }
    }
}

