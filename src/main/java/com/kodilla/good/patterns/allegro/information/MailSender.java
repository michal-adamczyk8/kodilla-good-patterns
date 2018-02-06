package com.kodilla.good.patterns.allegro.information;

import com.kodilla.good.patterns.allegro.User;

public class MailSender implements InformationService {
    @Override
    public void inform(User user, String product, double quantity, double price){
        System.out.println(user.getUsername() + "! Zakupiłeś " + quantity + " " + product + " po cenie " + price
                + "prosimy o dokonanie oplaty w przeciągu 7 dni.");
    }
}
