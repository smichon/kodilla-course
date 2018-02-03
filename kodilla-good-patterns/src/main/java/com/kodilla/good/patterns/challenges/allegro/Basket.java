package com.kodilla.good.patterns.challenges.allegro;

public class Basket {
    private User user;
    private Item item;

    public Basket(User user, Item item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }
}

