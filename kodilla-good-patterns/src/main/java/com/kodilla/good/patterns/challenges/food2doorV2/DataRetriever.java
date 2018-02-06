package com.kodilla.good.patterns.challenges.food2doorV2;

import java.util.Arrays;

public class DataRetriever {

    public ExtraFoodShop retrieveExtraFoodShop() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "01", Arrays.asList(
                new Products("Carrot", "047", 10, Products.Type.VEGETABLE),
                new Products("Apple", "035", 16, Products.Type.FRUIT),
                new Products("Broccoli", "036", 16, Products.Type.VEGETABLE)));
        return extraFoodShop;
    }

    public HealthyShop retrieveHealthyShop() {
        HealthyShop healthyShop = new HealthyShop("HealthyShop", "02", Arrays.asList(
                new Products("Lettuce", "012", 17, Products.Type.VEGETABLE),
                new Products("Chicken", "009", 14, Products.Type.MEAT),
                new Products("Corn", "026", 11, Products.Type.GRAIN)));
        return healthyShop;
    }

    public GlutenFreeShop retrieveGlutenFreeShop() {
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", "03", Arrays.asList(
                new Products("Rice", "013", 15, Products.Type.GRAIN ),
                new Products("Beef", "014", 9, Products.Type.MEAT),
                new Products("Soybeans", "005", 11, Products.Type.GRAIN)));
        return glutenFreeShop;
    }
}
