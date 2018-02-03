package com.kodilla.good.patterns.challenges.allegro;

public class EntryDataRetriever {
    public Basket retrieve() {
        User user = new User("Johnny80", "John", "Kowalsky", "007");
        Item item = new Item("BestSeller", "1657");

        return new Basket(user, item);
    }
}
