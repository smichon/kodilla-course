package com.kodilla.good.patterns.challenges.food2doorV2;

public class FoodOrderExecute {
    public static void main(String[] args) {
        DataRetriever dataRetriever = new DataRetriever();
        ExtraFoodShop extraFoodShop = dataRetriever.retrieveExtraFoodShop();

        OrderServiceProcessor orderServiceProcessor = new OrderServiceProcessor(new OrderServiceImpl() , new InformToConfirm());
        orderServiceProcessor.order(extraFoodShop);
    }
}
