package com.kodilla.good.patterns.challenges.allegro;

public class SendInformation implements InformationService {

    public void inform(User user) {
        System.out.println("Congratulations " + user.getLoginName()+",\nYou have bought ordered items.");
    }
}
