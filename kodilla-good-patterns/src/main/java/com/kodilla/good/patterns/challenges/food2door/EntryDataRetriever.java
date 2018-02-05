package com.kodilla.good.patterns.challenges.food2door;

import java.util.Arrays;

public class EntryDataRetriever {

    public Supplier retrieveSupplier1() {
        Supplier extraFoodShop = new Supplier("ExtraFoodShop", "01", Arrays.asList(
                new Product("Carrot", "047", 10, Product.Type.VEGETABLE),
                new Product("Apple", "035", 16, Product.Type.FRUIT),
                new Product("Broccoli", "036", 16, Product.Type.VEGETABLE)));
        return extraFoodShop;
    }

    public Supplier retrieveSupplier2() {
        Supplier healthyShop = new Supplier("HealthyShop", "02", Arrays.asList(
                new Product("Lettuce", "012", 17, Product.Type.VEGETABLE),
                new Product("Chicken", "009", 14, Product.Type.MEAT),
                new Product("Corn", "026", 11, Product.Type.GRAIN)));
        return healthyShop;
    }

    public Supplier retrieveSupplier3() {
        Supplier glutenFreeShop = new Supplier("GlutenFreeShop", "03", Arrays.asList(
                new Product("Rice", "013", 15, Product.Type.GRAIN ),
                new Product("Beef", "014", 9, Product.Type.MEAT),
                new Product("Soybeans", "005", 11, Product.Type.GRAIN)));
        return glutenFreeShop;
    }
}
