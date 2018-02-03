package com.kodilla.good.patterns.challenges.allegro;

public class Item {
    private String seller;
    private String itemID;

    public Item(String seller, String itemID) {
        this.seller = seller;
        this.itemID = itemID;
    }

    public String getSeller() {
        return seller;
    }

    public String getItemID() {
        return itemID;
    }
}
