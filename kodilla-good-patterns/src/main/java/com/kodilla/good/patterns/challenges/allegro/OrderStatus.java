package com.kodilla.good.patterns.challenges.allegro;

public class OrderStatus implements OrderInformation {

    public boolean bought(Item item, User user) {
        if (user.getLoginName()!=null && item.getItemID()!= null) {
            return true;
        } else {
            return false;
        }
    }
}
